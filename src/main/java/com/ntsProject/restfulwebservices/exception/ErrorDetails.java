//We are creating the error response as per our need but by default till now we are getting the error response because of ResponseEntityExceptionHandler -> handleException --------we have to over ride this method

package com.ntsProject.restfulwebservices.exception;

import java.time.LocalDate;

public class ErrorDetails {

	private LocalDate timestamp;
	private String message;
	private String details;

	public ErrorDetails(LocalDate timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
}
