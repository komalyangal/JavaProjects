package com.sunbeam.exceptions;

// checked exception
public class InvalidDateException extends Exception {

	public InvalidDateException() {
	}

	public InvalidDateException(String message) {
		super(message);
	}

}
