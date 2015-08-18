package com.unique.types;

public enum FileType {

  SOURCE_FILE(Long.valueOf(1)),
  DESTINATION_FILE(Long.valueOf(2));

  public static FileType valueOf(final Long value) {

    FileType returnValue = null;

    for (int i = 0; i < FileType.values().length; i++) {
      if (FileType.values()[i].getValue().equals(value)) {
        returnValue = FileType.values()[i];
        break;
      }
    }
    return returnValue;
  }

  private final Long value;

  private FileType(final Long value) {

    this.value = value;
  }

  public Long getValue() {

    return this.value;
  }
}
