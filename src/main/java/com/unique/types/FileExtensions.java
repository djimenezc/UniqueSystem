package com.unique.types;

public enum FileExtensions {

  TXT("txt"),
  // ODS("ods"),
  XLS("xls"),
  CSV("csv"),
  TEL("tel"),
  UNRECOGNIZABLE("");

  public static FileExtensions valueStringOf(final String value) {

    FileExtensions returnValue = null;

    for (int i = 0; i < FileExtensions.values().length; i++) {
      if (FileExtensions.values()[i].getValue().equals(value)) {
        returnValue = FileExtensions.values()[i];
        break;
      }
    }
    return returnValue;
  }

  private final String value;

  private FileExtensions(final String value) {

    this.value = value;
  }

  public String getValue() {

    return this.value;
  }
}
