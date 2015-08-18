package com.unique.types.adsl;

public enum BisRepeatedType {

  Bis("B"),
  Cuadruplicado("C"),
  Duplicado("D"),
  Kilómetro("K"),
  Quintuplicado("Q"),
  Triplicado("T"),
  Kilómetro_margen_derecho("X"),
  Kilómetro_margen_izquierdo("Y"),
  Not_value(" ");

  public static BisRepeatedType valueStringOf(final String value) {

    BisRepeatedType returnValue = null;

    for (int i = 0; i < BisRepeatedType.values().length; i++) {

      if (BisRepeatedType.values()[i].getValue().equals(value)) {
        returnValue = BisRepeatedType.values()[i];
        break;
      }
    }
    return returnValue;
  }

  private final String value;

  private BisRepeatedType(final String value) {

    this.value = value;
  }

  public String getValue() {

    return this.value;
  }
}
