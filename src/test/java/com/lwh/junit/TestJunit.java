package com.lwh.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestJunit {

	String message = "hello junit test";
	MessageUtils messageUtils = new MessageUtils(message);

	@Test
	public void testPrintMessage() {
		message = "hey, this is another message";
		assertEquals(message, messageUtils.printMessage());
	}
}
