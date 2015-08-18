package com.unique.types;

public enum Gender {

  MALE(Long.valueOf(1)),
  FEMALE(Long.valueOf(2));

  public static Gender valueOf(final Long value) {

    Gender returnValue = null;

    for (int i = 0; i < Gender.values().length; i++) {
      if (Gender.values()[i].getValue().equals(value)) {
        returnValue = Gender.values()[i];
        break;
      }
    }
    return returnValue;
  }

  private final Long value;

  private Gender(final Long value) {

    this.value = value;
  }

  public Long getValue() {

    return this.value;
  }
}
