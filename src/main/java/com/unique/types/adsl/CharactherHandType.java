package com.unique.types.adsl;

public enum CharactherHandType {

  Apartamento("APTO"),
  Centro("CTRO"),
  Derecha("DCHA"),
  Despacho("DPCH"),
  Exterior("EXT."),
  Habitación("HABI"),
  Interior("INT."),
  Izquierda("IZDA"),
  Local("LOCL"),
  Oficina("OFIC"),
  Puesto("PTO."),
  Tienda("TDA.");

  public static CharactherHandType valueStringOf(final String value) {

    CharactherHandType returnValue = null;

    for (int i = 0; i < CharactherHandType.values().length; i++) {

      if (CharactherHandType.values()[i].getValue().equals(value)) {
        returnValue = CharactherHandType.values()[i];
        break;
      }
    }
    return returnValue;
  }

  private final String value;

  private CharactherHandType(final String value) {

    this.value = value;
  }

  public String getValue() {

    return this.value;
  }

}
