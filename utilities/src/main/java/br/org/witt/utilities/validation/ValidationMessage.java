package br.org.witt.utilities.validation;

public class ValidationMessage {

	private String itemId;
	private String message;
	private Object[] arguments;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Object[] getArguments() {
		return arguments;
	}
	
	public void setArguments(Object[] arguments) {
		this.arguments = arguments;
	}
}
