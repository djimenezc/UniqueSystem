package com.unique.types.adsl;

public enum PortalType {

  Portal("O"),
  Puerta("U"),
  Not_value(" ");

  public static PortalType valueStringOf(final String value) {

    PortalType returnValue = null;

    for (int i = 0; i < PortalType.values().length; i++) {

      if (PortalType.values()[i].getValue().equals(value)) {
        returnValue = PortalType.values()[i];
        break;
      }
    }
    return returnValue;
  }

  private final String value;

  private PortalType(final String value) {

    this.value = value;
  }

  public String getValue() {

    return this.value;
  }

}
