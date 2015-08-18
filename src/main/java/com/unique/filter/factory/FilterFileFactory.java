package com.unique.filter.factory;

import javax.swing.filechooser.FileFilter;

import com.unique.filter.DataFileExtensionFilter;

public class FilterFileFactory {

  public static FileFilter getSourceFilter() {

    FileFilter filter;

    filter = new DataFileExtensionFilter();

    return filter;
  }

  public static FileFilter getDestinationFilter() {

    FileFilter filter;

    filter = new DataFileExtensionFilter();

    return filter;
  }

}
