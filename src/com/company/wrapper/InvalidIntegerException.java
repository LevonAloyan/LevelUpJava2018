package com.company.wrapper;

public class InvalidIntegerException extends RuntimeException {

  public InvalidIntegerException() {
    super();
  }

  public InvalidIntegerException(String message) {
    super(message);
  }

  public InvalidIntegerException(String message, Throwable cause) {
    super(message, cause);
  }

  public InvalidIntegerException(Throwable cause) {
    super(cause);
  }

  protected InvalidIntegerException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
