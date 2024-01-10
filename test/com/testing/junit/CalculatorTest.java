package com.testing.junit;


// J-unit 5 annotations
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

// J-unit 4 annotations
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.BeforeClass;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.After;

public class CalculatorTest {
	
//	@BeforeClass
	@BeforeAll
	public static void init() {
		System.out.println("HEllO");
		// executes method before starting testing test cases
		// can be used for new connection / opening file
	}
	
//	@Before
	@BeforeEach
	public void beforeTestCase() {
		System.out.println("Before Test Case");
		// executes method before each test case
	}
//	@After
	@AfterEach
	public void afterTestCase() {
		System.out.println("After Test Case");
		// executes method after each test case
	}
	
	static int result, expected;
	@Test
	@DisplayName("Test 1") // it will display name as "Test 1" instead of "addNumbersTest()"
	public void addNumbersTest() {
		// actual result 
		int result = Calculator.addNumbers(3, 5);
		// expected result
		int expected = 8;
//		Assert.assertEquals(expected, result);
		Assertions.assertEquals(expected, result, "Test fail!");
		System.out.println("Testing addNumbersTest - 1");
	}
	
	// if the below test case takes more than 2sec it will throw error
//	@Test(timeout = 2000)
	@Test // timeout not supported in JUnit-5
//	@Disabled // to make it disable for testing
	public void addAnyNumbersTest() {
		result = Calculator.addAnyNumbers(2,3,4,5,6,7);
		expected = 27;
		Assertions.assertEquals(expected, result);
		System.out.println("Testing addAnyNumbersTest - 2");
	}
	
//	@AfterClass
	@AfterAll
	public static void exit() {
		System.out.println("EXITING");
		// executes method after testing all the test cases
		// can be used for closing open connection / opened file
	}
	
	// some other annotations in junit-5
//	@Tag
//	@Tags
//	@Nested
//	@TestFactory
    
}