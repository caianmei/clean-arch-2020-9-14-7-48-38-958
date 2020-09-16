package com.thoughtworks.cleanarch.domain.context.edit;

import com.thoughtworks.cleanarch.domain.core.exception.DomainException;

@SuppressWarnings("serial")
public class BlogNotFoundException extends DomainException {

	public BlogNotFoundException() {
		super();
	}
	public BlogNotFoundException(String message) {
	    super(message);
	}
}
