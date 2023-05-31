package junit;

import static org.testng.Assert.assertFalse;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

@Test
public class Assertions {
	
	public void test() {
		assertFalse(10>5);
		assertTrue(10>5);
	}

}
