package com.unique.types.adsl;

public enum BlockType {

  Almacen("A"),
  Bloque("B"),
  Casa("C"),
  Edificio("E"),
  Garaje("G"),
  Chalet("H"),
  Pabellon("L"),
  Nave("N"),
  Parcela("P"),
  Grupo("R"),
  Sector("S"),
  Torre("T"),
  Zona("Z"),
  Not_value(" ");

  public static BlockType valueStringOf(final String value) {

    BlockType returnValue = null;

    for (int i = 0; i < BlockType.values().length; i++) {

      if (BlockType.values()[i].getValue().equals(value)) {
        returnValue = BlockType.values()[i];
        break;
      }
    }
    return returnValue;
  }

  private final String value;

  private BlockType(final String value) {

    this.value = value;
  }

  public String getValue() {

    return this.value;
  }
}
