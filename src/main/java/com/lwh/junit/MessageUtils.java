package com.lwh.junit;

public class MessageUtils {

	private String message;

	/**
	 * Constructor
	 * @param message to be printed
	 */
	public MessageUtils(String message) {
		this.message = message;
	}

	/**
	 * Print the message and return itself.
	 * @return the message
	 */
	public String printMessage() {
		System.out.println(message);
		return message;
	}
}
