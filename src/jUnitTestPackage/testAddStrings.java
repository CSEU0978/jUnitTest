package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions jUnitString = new jUnitFunctions();
		String result = jUnitString.addString("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
