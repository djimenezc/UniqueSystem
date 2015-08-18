package com.unique.frame;

import javax.swing.table.TableModel;

import org.uispec4j.Button;
import org.uispec4j.Table;
import org.uispec4j.UISpec4J;
import org.uispec4j.UISpecTestCase;
import org.uispec4j.Window;
import org.uispec4j.interception.MainClassAdapter;

import com.unique.controller.Controller;
import com.unique.controller.ControllerImpl;
import com.unique.frame.DesktopApplication1;
import com.unique.frame.tables.PersonTableModel;

public abstract class ParserFrameTestCase extends UISpecTestCase {

  protected Controller controller = ControllerImpl.getInstance();

  protected Table recordsTable;
  private Button addRecordButton;
  private Button removalRecordButton;
  private Button editRecordButton;

  protected void addRecord(final String firstName, final String lastName) {
    addRecord(firstName, lastName, "", "", "");
  }

  protected void addRecord(final String firstName, final String lastName,
    final String email, final String phone, final String mobile) {
    addRecordButton.click();
    changeFields(firstName, lastName, email, phone, mobile);
  }

  protected void changeFields(final String firstName, final String lastName,
    final String email, final String phone, final String mobile) {
  }

  protected void editRecord() {
    editRecordButton.click();
  }

  protected void removalRecord() {
    removalRecordButton.click();
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    setAdapter(new MainClassAdapter(DesktopApplication1.class));

    final Window window = getMainWindow();
    this.recordsTable = window.getTable();
    this.addRecordButton = window.getButton("load records file");
    this.removalRecordButton = window.getButton("load records file");
    this.editRecordButton = window.getButton("load records file");

    final TableModel dataModel = new PersonTableModel();

    this.recordsTable.getJTable().setModel(dataModel);

    UISpec4J.setWindowInterceptionTimeLimit(100);
  }
}
