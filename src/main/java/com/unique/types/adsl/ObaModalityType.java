package com.unique.types.adsl;

public enum ObaModalityType {

  Limitada("T"),
  Inicial("Z"),
  Estándar("O"),
  Básica("B"),
  Class("J"),
  Máxima("A"),
  Avanzada("C"),
  Premium("N"),
  Top("E"),
  // Premium("F"),
  Estándar_Rural("R"),
  Class_Rural("G"),
  Avanzada_Rural("S"),
  Premium_Rural("V"),
  ACG_Class("L"),
  ACG_Avanzada("M"),
  ACG_Premium("P"),
  Simetrica_Básica("W"),
  Simetrica_Class("Y");

  public static ObaModalityType valueStringOf(final String value) {

    ObaModalityType returnValue = null;

    for (int i = 0; i < ObaModalityType.values().length; i++) {

      if (ObaModalityType.values()[i].getValue().equals(value)) {
        returnValue = ObaModalityType.values()[i];
        break;
      }
    }
    return returnValue;
  }

  private final String value;

  private ObaModalityType(final String value) {

    this.value = value;
  }

  public String getValue() {

    return this.value;
  }

}
