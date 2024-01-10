package com.testing.junit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AssertExample {
	// Assertion : validating actual result with expected result
	// Assertions class
	// most of the methods are overloaded
	
	@Test
	public void test1() {
		System.out.println("Testing assertions methods");
//		int actual = 12;
//		int expected = 12;
//		double actual = 12;
//		double expected = 12;
		int actual = 12; // one primitive type
		Integer expected = 12; // one wrapper class
		// overloaded methods: {int, byte, double, float, etc}
		Assertions.assertEquals(expected, actual);
		
		int [] actualArr = {1,2,3,4,5};
		int [] expectedArr = {1,2,3,4,5};
		Assertions.assertArrayEquals(expectedArr, actualArr);
		
		// test fails (assertSame): as both are refering to different objects
		// test pass (assertEquals): checks content is same or not
//		String name = new String("dinesh");
//		String expName = new String("dinesh");
		// test pass (assertSame): as both are refering to same objects
		String name = "dinesh";
		String expName = "dinesh";
//		Assertions.assertSame(expName, name); 
//		Assertions.assertEquals(expName, name);
//		Assertions.assertSame(expName, name); 
		Assertions.assertEquals(expName, name);
	}
	
}
