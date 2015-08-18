package com.unique.service;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;

import com.unique.constants.UniqueFormatConstants;
import com.unique.dao.PersonDao;
import com.unique.dao.impl.TxtPersonDaoImpl;
import com.unique.dao.impl.XmlPersonDaoImpl;
import com.unique.exceptions.FileException;
import com.unique.model.PersonTo;
import com.unique.util.file.FileUtil;

public class UniqueServiceImpl implements UniqueService {

	private static final String XML = "xml";
	private static final String TXT = "txt";
	private PersonDao personDao;

	private static Logger logger = Logger.getLogger(UniqueServiceImpl.class);

	private Integer requestNumber = UniqueFormatConstants.REQUEST_NUMBER_INITIAL;

	public UniqueServiceImpl() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.unique.service.ParserFileTelefonicaService#
	 * getNexRequestNumber()
	 */
	public Integer getNextRequestNumber() {

		return requestNumber;
	}

	@Override
	public void incrementRequestNumber() {

		requestNumber++;
	}

	@Override
	public List<PersonTo> loadSourceFile(final String sourceFilePath)
			throws FileException, IOException {

		logger.info("Loading file " + sourceFilePath);

		String extension = FileUtil.getFileExtension(sourceFilePath);

		if (extension.equals(XML)) {

			personDao = new XmlPersonDaoImpl(PersonTo.class, sourceFilePath);
		} else if (extension.equals(TXT)) {

			personDao = new TxtPersonDaoImpl(PersonTo.class, sourceFilePath);
		}

		return (List<PersonTo>) personDao.loadAll();
	}

	@Override
	public List<PersonTo> addPerson(PersonTo person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonTo> deletePerson(PersonTo person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonTo updateRecordToTableModel(PersonTo person) {
		// TODO Auto-generated method stub
		return null;
	}

}
