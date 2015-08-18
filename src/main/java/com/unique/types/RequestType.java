package com.unique.types;

public enum RequestType {

  PPT300("PPT300"),
  PPS300("PPS300"),
  PPE300("PPE300"),
  PPR300("PPR300"),
  PDT300("PDT300"),
  PDE300("PDE300"),
  PDS300("PDS300"),
  PDR300("PDR300");

  private final String value;

  private RequestType(final String value) {

    this.value = value;
  }

  public String getValue() {

    return this.value;
  }

}
