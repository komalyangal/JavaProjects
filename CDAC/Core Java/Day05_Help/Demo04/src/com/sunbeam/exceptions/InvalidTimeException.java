package com.sunbeam.exceptions;

// unchecked Exception
public class InvalidTimeException extends RuntimeException {

	public InvalidTimeException() {
	}

	public InvalidTimeException(String message) {
		super(message);
	}

}
