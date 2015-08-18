package com.unique.frame.tables;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import com.unique.model.PersonTo;

public class PersonTableModel extends AbstractTableModel {

  private static final long serialVersionUID = 5733326590900917759L;

  private final String[] columnNames = { "Person Number", "First Name", "Last Name" };

  private ArrayList<Object[]> data = new ArrayList<Object[]>();;

  public PersonTableModel() {

  }

  public PersonTableModel(final ArrayList<Object[]> data) {

    this.data = data;
  }

  public int addRecord(final PersonTo PersonTo) {

    final Object[] vector = new Object[columnNames.length];

//    vector[0] = lineRecordTO.getRequestDataTo().getRequestNumber();
//    vector[1] = lineRecordTO.getRequestDataTo().getRequestType();
//    vector[2] = lineRecordTO.getRequestDataTo().getRequestDate();

    data.add(vector);

    return 1;
  }

  /*
   * JTable uses this method to determine the default renderer/ editor for each
   * cell. If we didn't implement this method, then the last column would
   * contain text ("true"/"false"), rather than a check box.
   */
  @Override
  public Class<? extends Object> getColumnClass(final int c) {
    return getValueAt(0, c).getClass();
  }

  public int getColumnCount() {
    return columnNames.length;
  }

  @Override
  public String getColumnName(final int col) {
    return columnNames[col];
  }

  public int getRowCount() {
    return data.size();
  }

  public Object getValueAt(final int row, final int col) {
    return data.get(row)[col];
  }

  /*
   * Don't need to implement this method unless your table's editable.
   */
  @Override
  public boolean isCellEditable(final int row, final int col) {
    // Note that the data/cell address is constant,
    // no matter where the cell appears onscreen.
    if (col < 1) {
      return false;
    }
    else {
      return true;
    }
  }

  /*
   * Don't need to implement this method unless your table's data can change.
   */
  @Override
  public void setValueAt(final Object value, final int row, final int col) {
    data.get(row)[col] = value;
    fireTableCellUpdated(row, col);
  }
}
