package com.adition.addition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void testSum() {
		Add add = new Add();
		int actual = add.sum(10, 5);
		int expected = 15;

		assertEquals(expected, actual);

	}

}
