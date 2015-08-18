package com.unique.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.table.TableModel;

import org.apache.log4j.Logger;

import com.unique.frame.UniqueFrame;
import com.unique.frame.tables.PersonTableModel;
import com.unique.patterns.Event;
import com.unique.service.UniqueService;
import com.unique.service.UniqueServiceImpl;
import com.unique.types.ControllerResponseType;
import com.unique.types.State;

public class ControllerImpl implements Controller {

	private static Logger logger = Logger.getLogger(ControllerImpl.class);

	private static ControllerImpl controllerImpl;

	public static ControllerImpl getInstance() {

		if (controllerImpl == null) {

			controllerImpl = new ControllerImpl();
		}

		return controllerImpl;
	}

	private final Map<String, JFrame> viewsMap;

	private State state;
	private final UniqueService parserFileTelefonicaService;
	private final Properties properties = new Properties();
	// private final List<LineRecordTO> recordsList = new
	// ArrayList<LineRecordTO>();
	private TableModel tableModel;

	private ControllerImpl() {

		parserFileTelefonicaService = new UniqueServiceImpl();
		changeState(State.BEGIN_APPLICATION);
		viewsMap = new HashMap<String, JFrame>();
		tableModel = new PersonTableModel();

		try {
			properties.load(new FileInputStream("application.properties"));
		} catch (final IOException e) {
		}

	}

	/**
	 * @param event
	 */
	private void addNewRecord(final Event event) {

		// parserFileTelefonicaService.createRecord((LineRecordTO)
		// event.getValue(),
		// recordsList);
		//
		// tableModel =
		// parserFileTelefonicaService.addRecordToTableModel(
		// (LinesTableModel) tableModel, recordsList.get(recordsList.size() -
		// 1));

		parserFileTelefonicaService.incrementRequestNumber();

		final UniqueFrame frame = (UniqueFrame) viewsMap.get("UniqueFrame");

		frame.updateJTable(tableModel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.unique.controller.Controller#addView(java.lang .String,
	 * javax.swing.JFrame)
	 */
	public void addView(final String name, final JFrame jFrame) {

		viewsMap.put(name, jFrame);

	}

	/**
	 * @param event
	 */
	private void changeFileTextBox(final Event event) {
		final UniqueFrame uniqueFrame = (UniqueFrame) viewsMap
				.get("UniqueFrame");

	}

	private void changeState(final State state) {

		this.state = state;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.unique.controller.Controller#getNextRequestNumber ()
	 */
	public Integer getNextRequestNumber() {

		return parserFileTelefonicaService.getNextRequestNumber();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.unique.controller.Controller#getState()
	 */
	public State getState() {
		return state;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.unique.controller.Controller#getTableModel()
	 */
	public TableModel getTableModel() {

		return tableModel;
	}

	public ControllerResponseType onEvent(final Event event) {

		logger.debug("Received event " + event.getEventType().toString());

		ControllerResponseType controllerResponse = ControllerResponseType.OK;

		switch (event.getEventType()) {

		case CHANGE_FILE_TEXT_BOX: {
			changeFileTextBox(event);
			break;
		}

		case ADD_RECORD:
			addNewRecord(event);
			break;

		case READ_DESTINATION_FILE_PATH:
			changeState(State.READING_DESTINATION_FILE_PATH);
			break;

		case READ_SOURCE_FILE_PATH:
			changeState(State.READING_SOURCE_FILE_PATH);
			break;

		default:

		}
		;

		return controllerResponse;
	}

}