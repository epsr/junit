package com.lwh.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssertions {

	String s1 = "abc";
	String s2 = "abc";
	String str = null;
	int val1 = 5;
	int val2 = 6;
	int[] arr1 = { 1, 2, 3 };
	int[] arr2 = { 1, 2, 3 };

	@Test
	public void testAssertions() {
		// true s1==s2.
		assertEquals(s1, s2);
		// true 5<6
		assertTrue(val1 < val2);
		// true 5!=6
		assertFalse(val1 == val2);
		// true str==null
		assertNull(str);
		// true
		assertArrayEquals(arr1, arr2);
	}
}
