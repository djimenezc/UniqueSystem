package com.unique.facade;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.swing.table.TableModel;

import com.unique.frame.tables.PersonTableModel;
import com.unique.model.PersonTo;
import com.unique.service.UniqueService;

public class FacadeUniqueImpl implements FacadeUnique {

	private UniqueService uniqueService;

	@Override
	public TableModel addRecordToTableModel(PersonTableModel tableModel,
			PersonTo person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TableModel deleteRecordToTableModel(PersonTableModel tableModel,
			PersonTo person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TableModel updateRecordToTableModel(PersonTableModel tableModel,
			PersonTo person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonTo getPersonData(long personNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public UniqueService getUniqueService() {
		return uniqueService;
	}

	public void setUniqueService(UniqueService uniqueService) {
		this.uniqueService = uniqueService;
	}

	@Override
	public int loadDataSource(String filePath, PersonTableModel tableModel) {

		int result=1;

		try {

			List<PersonTo> list = uniqueService.loadSourceFile(filePath);

			for (PersonTo person : list) {
				tableModel.addRecord(person);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = -1;	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = -2;
		}

		return result;
	}
}
