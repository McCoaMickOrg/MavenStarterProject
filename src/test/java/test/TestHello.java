package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Hello;

// Create as many of these as needed
public class TestHello {
	// Instantiate fields

	// Use the @Test annotation for each test
	// Use the naming convention test + Action
	@Test
	public void testSayHello() {
		assertEquals("Hello", Hello.sayHello());
	}

}
