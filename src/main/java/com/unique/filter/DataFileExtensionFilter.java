package com.unique.filter;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class DataFileExtensionFilter extends FileFilter {

  private final String[] okFileExtensions = new String[] {".xml", ".txt" };

  @Override
  public boolean accept(final File file) {

    // We always allow directories, regardless of their extension
    if (file.isDirectory()) {
      return true;
    }

    for (final String extension : okFileExtensions) {
      if (file.getName().toLowerCase().endsWith(extension)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String getDescription() {

    final StringBuffer description = new StringBuffer();

    for (final String string : okFileExtensions) {
      description.append("*");
      description.append(string);
      description.append(",");
    }

    return description.substring(0, description.length() - 1);
  }

}
