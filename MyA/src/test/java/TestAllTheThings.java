import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAllTheThings {

	@Test
	void testEverything() {
		assertTrue(true);
	}
	
	@Test
	void testAddition() {
		
		assertEquals( addTwoNumbers(4,3), 7);
	}

}
