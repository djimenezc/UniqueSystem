package com.unique.types.adsl;

public enum RegionType {

  Álava("01"),
  Albacete("02"),
  Alicante("03"),
  Almería("04"),
  Ávila("05"),
  Badajoz("06"),
  Illes_Balears("07"),
  Barcelona("08"),
  Burgos("09"),
  Cáceres("10"),
  Cádiz("11"),
  Castellón("12"),
  Ciudad_Real("13"),
  Córdoba("14"),
  Coruña("15"),
  Cuenca("16"),
  Girona("17"),
  Granada("18"),
  Guadalajara("19"),
  Guipuzcoa("20"),
  Huelva("21"),
  Huesca("22"),
  Jaén("23"),
  León("24"),
  Lleida("25"),
  La_Rioja("26"),
  Lugo("27"),
  Madrid("28"),
  Málaga("29"),
  Murcia("30"),
  Navarra("31"),
  Ourense("32"),
  Asturias("33"),
  Palencia("34"),
  Las_Palmas("35"),
  Pontevedra("36"),
  Salamanca("37"),
  S_C_Tenerife("38"),
  Cantabria("39"),
  Segovia("40"),
  Sevilla("41"),
  Soria("42"),
  Tarragona("43"),
  Teruel("44"),
  Toledo("45"),
  Valencia("46"),
  Valladolid("47"),
  Vizcaya("48"),
  Zamora("49"),
  Zaragoza("50"),
  Ceuta("51"),
  Melilla("52"),
  Andorra("AD");

  public static RegionType valueStringOf(final String value) {

    RegionType returnValue = null;

    for (int i = 0; i < RegionType.values().length; i++) {

      if (RegionType.values()[i].getValue().equals(value)) {
        returnValue = RegionType.values()[i];
        break;
      }
    }
    return returnValue;
  }

  private final String value;

  private RegionType(final String value) {

    this.value = value;
  }

  public String getValue() {

    return this.value;
  }

}
