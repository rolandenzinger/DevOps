import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAllTheThings {

	@Test
	void testEverything() {
		assertTrue(true);
	}
	
	@Test
	void testAddition() {
		
		assertEquals( MyMainClass.addTwoNumbers(4,3), 7);
		
		
	}
	
	@Test
	void testSecondAddition() {
		
		assertEquals( MyMainClass.addTwoNumbers(10,5),15);
		
		
	}

}
