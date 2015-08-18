package com.unique.types.adsl;

public enum StairsType {

  Izquierda("V"),
  Derecha("W"),
  Centro("X"),
  Interior("Y"),
  Exterior("Z"),
  Not_value("  ");

  public static StairsType valueStringOf(final String value) {

    StairsType returnValue = null;

    for (int i = 0; i < StairsType.values().length; i++) {

      if (StairsType.values()[i].getValue().equals(value)) {
        returnValue = StairsType.values()[i];
        break;
      }
    }
    return returnValue;
  }

  private final String value;

  private StairsType(final String value) {

    this.value = value;
  }

  public String getValue() {

    return this.value;
  }
}
