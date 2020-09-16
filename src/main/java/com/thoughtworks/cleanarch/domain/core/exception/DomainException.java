package com.thoughtworks.cleanarch.domain.core.exception;

@SuppressWarnings("serial")
public class DomainException extends RuntimeException{
	public DomainException() {
		super();
	}
	public DomainException(String message) {
	    super(message);
	}
}
