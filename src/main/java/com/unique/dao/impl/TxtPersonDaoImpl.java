package com.unique.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.unique.dao.PersonDao;
import com.unique.model.PersonTo;
import com.unique.persistence.dao.FileGenericDao;

/**
 * @author djimenez
 */
public class TxtPersonDaoImpl extends FileGenericDao<PersonTo,Long>  implements PersonDao {

	public TxtPersonDaoImpl(Class<PersonTo> persistentClass, String sourceFile) {
		super(persistentClass, sourceFile);
	}

	@Override
	public void remove(Long entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Long entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long findById(PersonTo id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<PersonTo> loadAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<PersonTo> findByNamedQuery(String queryName,
			Map<String, Object> queryParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonTo findFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonTo get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonTo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonTo> getAllDistinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonTo save(PersonTo object) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
