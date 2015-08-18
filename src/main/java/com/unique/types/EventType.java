package com.unique.types;

public enum EventType {

  CHANGE_FILE_TEXT_BOX(1),
  FILES_CONVERT(2),
  ADD_RECORD(3),
  LOAD_SOURCE_FILE(4),
  READ_DESTINATION_FILE_PATH(5),
  READ_SOURCE_FILE_PATH(6);

  public static EventType valueOf(final Integer value) {

    EventType returnValue = null;

    for (int i = 0; i < EventType.values().length; i++) {
      if (EventType.values()[i].getValue().equals(value)) {
        returnValue = EventType.values()[i];
        break;
      }
    }
    return returnValue;
  }

  private final Integer value;

  private EventType(final Integer value) {

    this.value = value;
  }

  public Integer getValue() {

    return this.value;
  }

}
