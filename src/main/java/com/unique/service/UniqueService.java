package com.unique.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.unique.model.PersonTo;

public interface UniqueService {

	public abstract List<PersonTo> addPerson(
			PersonTo person);
	
	public abstract  List<PersonTo> deletePerson(
			 PersonTo person);
	
	public abstract  PersonTo updateRecordToTableModel(
			PersonTo person);


	/**
	 * @return
	 */
	public abstract Integer getNextRequestNumber();

	public void incrementRequestNumber();

	List<PersonTo>  loadSourceFile(String sourceFile)
			throws FileNotFoundException, IOException;
}