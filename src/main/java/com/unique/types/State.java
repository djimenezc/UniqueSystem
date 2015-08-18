package com.unique.types;

public enum State {

  READING_SOURCE_FILE_PATH(Long.valueOf(1)),
  READING_DESTINATION_FILE_PATH(Long.valueOf(2)),
  BEGIN_APPLICATION(Long.valueOf(3));

  public static State valueOf(final Long value) {

    State returnValue = null;

    for (int i = 0; i < State.values().length; i++) {
      if (State.values()[i].getValue().equals(value)) {
        returnValue = State.values()[i];
        break;
      }
    }
    return returnValue;
  }

  private final Long value;

  private State(final Long value) {

    this.value = value;
  }

  public Long getValue() {

    return this.value;
  }
}
