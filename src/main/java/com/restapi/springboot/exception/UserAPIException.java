package com.restapi.springboot.exception;

public class UserAPIException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public UserAPIException(String message) {
		super(message);
	}

	public UserAPIException(String message, Throwable cause) {
		super(message, cause);
	}
}
