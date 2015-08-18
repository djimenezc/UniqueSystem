package com.unique.facade;

import javax.swing.table.TableModel;

import com.unique.frame.tables.PersonTableModel;
import com.unique.model.PersonTo;

public interface FacadeUnique {

	public int loadDataSource(String filePath, PersonTableModel tableModel);
	
	public  TableModel addRecordToTableModel(
			PersonTableModel tableModel, PersonTo person);
	
	public TableModel deleteRecordToTableModel(
			PersonTableModel tableModel, PersonTo person);
	
	public TableModel updateRecordToTableModel(
			PersonTableModel tableModel, PersonTo person);
	
	public PersonTo getPersonData(long personNumber);
	
}
