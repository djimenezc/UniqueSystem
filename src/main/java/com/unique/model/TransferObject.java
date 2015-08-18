package com.unique.model;

import java.io.Serializable;

public interface TransferObject<E> extends Serializable {

  String getString();

  E getValue();

}
