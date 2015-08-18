package com.unique.controller;

import javax.swing.JFrame;
import javax.swing.table.TableModel;

import com.unique.patterns.EventListener;

public interface Controller extends EventListener {

  public abstract void addView(final String name, final JFrame jFrame);

  /**
   * @return the infoBean
   */
//  public abstract ParserFileTo getInfoFiles();

  public abstract Integer getNextRequestNumber();

  /**
   * @return the state
   */
//  public abstract State getState();

  public abstract TableModel getTableModel();

}