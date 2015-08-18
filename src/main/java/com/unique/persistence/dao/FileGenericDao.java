package com.unique.persistence.dao;

import java.io.Serializable;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class FileGenericDao<T, PK extends Serializable> implements
		GenericDaoExtend<T, PK> {

	private final Log log = LogFactory.getLog(getClass());

	private final Class<T> persistentClass;

	private Map<T, PK> elements;

	private String sourceFile;

	public FileGenericDao(final Class<T> persistentClass,
			final String sourceFile) {
		this.persistentClass = persistentClass;
		this.setSourceFile(sourceFile);
	}

	public String getSourceFile() {
		return sourceFile;
	}

	public void setSourceFile(String sourceFile) {
		this.sourceFile = sourceFile;
	}

	public Map<T, PK> getElements() {
		return elements;
	}

	public void setElements(Map<T, PK> elements) {
		this.elements = elements;
	}

}
