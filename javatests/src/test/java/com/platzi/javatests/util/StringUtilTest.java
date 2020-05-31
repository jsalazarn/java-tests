package com.platzi.javatests.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

		@Test
		public void repeat_string_once() {
			assertEquals("hola", StringUtil.repeat("hola", 1));
		}
		
		@Test
		public void repeat_string_multiple_times() {
			assertEquals("holaholahola", StringUtil.repeat("hola", 3));
		}
		
		@Test
		public void repeat_string_zero_times() {
			assertEquals("", StringUtil.repeat("hola", 0));
		}
		
		@Test(expected = IllegalArgumentException.class)
		public void repeat_string_negative_times() {
			StringUtil.repeat("hola", -1);
		}
		
		
		// PRUEBA UNITARIA MANUAL
		/*
		public static void main(String[] args) {
		
		String result = StringUtil.repeat("hola", 3);
		if (!result.equals("holaholaholas")) {
			throw new RuntimeException("ERROR");
		}
		}
		*/

}
