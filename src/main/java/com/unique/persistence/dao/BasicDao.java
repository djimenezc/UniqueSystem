package com.unique.persistence.dao;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author djimenez
 * @param <I>
 * @param <E>
 */
public interface BasicDao<I extends Serializable, E> {

  /**
   * Method that return a object from persistent tier by the field id
   * 
   * @param id
   * @return
   */
  E findById(I id);

  /**
   * Method that return the all objects of the parameterizable type-
   * 
   * @return
   */
  Collection<I> loadAll();

}
