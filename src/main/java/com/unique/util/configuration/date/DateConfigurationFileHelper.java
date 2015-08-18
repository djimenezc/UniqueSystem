package com.unique.util.configuration.date;

import java.io.IOException;

import com.unique.constants.PathConfigurationFiles;
import com.unique.util.configuration.AbstractConfigurationFileHelper;

/**
 * @author djimenez
 */
public final class DateConfigurationFileHelper extends
  AbstractConfigurationFileHelper {

  private static DateConfigurationFileHelper instance;

  public static DateConfigurationFileHelper getInstance() throws IOException {

    if (instance == null) {
      instance = new DateConfigurationFileHelper();
    }

    return instance;
  }

  private DateConfigurationFileHelper() throws IOException {

    loadBundle(PathConfigurationFiles.DATE_CONFIGURATION_FILE_PATH);
  }
}
