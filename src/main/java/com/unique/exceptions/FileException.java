package com.unique.exceptions;

public class FileException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public FileException() {
    super();
  }

  public FileException(final String message) {
    super(message);
  }

  public FileException(final String message, final Throwable cause) {
    super(message, cause);
  }

  public FileException(final Throwable cause) {
    super(cause);
  }

}
