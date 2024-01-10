package com.testing.junit;

//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {
	// if there are multiple annotations of same type(@Test) then junit doesn't guranttee which will run first.
	// so in junit we have couple of few more annotations - @BeforeEach, @BeforeAll, @AfterEach, @AfterAll etc.
	// positions of annotations doesn't matter what matter is just the annotations
	// also name of the method name doesn't matter, the Annotations matters
	
//	@BeforeAll
//	static void beforeAll() {
//		System.out.println("START");
//	}
//	
//	@BeforeEach
//	void beforeEach() {
//		System.out.println("runnning before Test");
//	}
//	
//	@Test
//	void test1() {
//		System.out.println("test1");
//	}
//	
//	@Test
//	void test2() {
//		System.out.println("test2");
//	}
//	
//	@Test
//	void test3() {
//		System.out.println("test3");
//	}
//	
//	@AfterEach
//	void afterEach() {
//		System.out.println("running after each test");
//	}
//	
//	@AfterAll
//	static void afterAll() {
//		System.out.println("END");
//	}

}
