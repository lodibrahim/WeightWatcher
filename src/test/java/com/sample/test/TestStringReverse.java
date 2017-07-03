package com.sample.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sample.shared.HandleString;

public class TestStringReverse {
	private final HandleString h= new HandleString();

	@Test
	public void reverseString(){
		String reversedString =h.reverseEverything("hope you are doing well");
		assertEquals("llew gniod era uoy epoh", reversedString);
	}
}
