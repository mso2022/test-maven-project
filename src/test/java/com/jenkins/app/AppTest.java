package com.jenkins.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for Simple Maven App.
 */
public class AppTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUp() {
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testAppConstructor() {
		try {
			new App();
		} catch (Exception e) {
			fail("Construction not working.");
		}
	}

	@Test
	public void testAppMain() {
		App.main(null);
		try {
			assertEquals("Hello India, This is 2022!" + System.getProperty("line.separator"), outContent.toString());
		} catch (AssertionError e) {
			fail("\"message\" is not \"Hello India!\"");
		}
	}

	@After
	public void cleanUp() {
		System.setOut(null);
	}

}
