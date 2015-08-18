package com.unique.types.adsl;

public enum PlantType {

  Altillo("AL"),
  Almacén("AM"),
  Ascensor("AS"),
  Atico("AT"),
  Bajo("BA"),
  Bungalow("BU"),
  Chalet("CH"),
  Dúplex("DU"),
  Entresuelo("EN"),
  Entreplanta("ET"),
  Garaje("GA"),
  Kiosco("KI"),
  Modulo("MO"),
  Local("LO"),
  Nave("NA"),
  Oficina("OF"),
  Principal("PR"),
  Puesto("PT"),
  Sobreático("SA"),
  // Semisotano ("SE"),
  Sotano("SO"),
  Semisotano("SS"),
  Sotano_1("S1"),
  Sotano_2("S2"),
  Sotano_3("S3"),
  Sotano_4("S4"),
  Sotano_5("S5"),
  Sotano_6("S6"),
  Sotano_7("S7"),
  Sotano_8("S8"),
  Sotano_9("S9"),
  Terraza("TE"),
  Tienda("TI"),
  Semisotano_1("X1"),
  Semisotano_2("X2"),
  Semisotano_3("X3"),
  Semisotano_4("X4"),
  Semisotano_5("X5"),
  Semisotano_6("X6"),
  Semisotano_7("X7"),
  Semisotano_8("X8"),
  Semisotano_9("X9");

  public static PlantType valueStringOf(final String value) {

    PlantType returnValue = null;

    for (int i = 0; i < PlantType.values().length; i++) {

      if (PlantType.values()[i].getValue().equals(value)) {
        returnValue = PlantType.values()[i];
        break;
      }
    }
    return returnValue;
  }

  private final String value;

  private PlantType(final String value) {

    this.value = value;
  }

  public String getValue() {

    return this.value;
  }
}
