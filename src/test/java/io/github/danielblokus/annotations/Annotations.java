package io.github.danielblokus.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class Annotations {

	@BeforeClass
	public void setUpEnvironment() {
		System.out.println("Set up environment");
	}

	@BeforeMethod
	public void setUp() {
		System.out.println("Run before each test method");
	}

	@Test
	public void exampleTest() {
		fail("Do nothing");
	}

	@AfterClass
	public void tearDown() {
		System.out.println("Run after all test methods");
	}
}