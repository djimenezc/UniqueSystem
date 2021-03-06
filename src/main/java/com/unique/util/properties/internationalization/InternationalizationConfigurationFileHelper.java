package com.unique.util.properties.internationalization;

import com.unique.constants.PathPropertiesFiles;
import com.unique.util.properties.PropertyException;
import com.unique.util.properties.PropertyHelper;

/**
 * @author djimenez
 */
public final class InternationalizationConfigurationFileHelper {

  private final PropertyHelper propertyHelper;

  private static InternationalizationConfigurationFileHelper instance;

  public static InternationalizationConfigurationFileHelper getInstance() {

    if (instance == null) {
      instance = new InternationalizationConfigurationFileHelper();
    }

    return instance;
  }

  private InternationalizationConfigurationFileHelper() {

    propertyHelper = PropertyHelper.getInstance();
  }

  /**
   * Returns the value string given a key and file name
   * 
   * @param find
   *          key in the file fileName
   * @return the value type String
   * @exception PropertyException
   *              if an I/O error occurs.
   */
  public String getProperty(final String key) {
    return propertyHelper.getProperty(key,
      PathPropertiesFiles.DEFAULT_PROPERTIES_FILE_PATH);
  }
}
