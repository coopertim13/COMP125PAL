package palWeek2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestActivities {
	
	@Test
	void testDifferenceOfTwo() {
		assertTrue(AllActivities.differenceOfTwo(4, 2));
		assertTrue(AllActivities.differenceOfTwo(2, 4));
		assertFalse(AllActivities.differenceOfTwo(2, 2));
		assertTrue(AllActivities.differenceOfTwo(-2, 0));
		assertTrue(AllActivities.differenceOfTwo(0, -2));
		assertTrue(AllActivities.differenceOfTwo(-1, 1));
		assertTrue(AllActivities.differenceOfTwo(1, -1));
		assertFalse(AllActivities.differenceOfTwo(0, 3));
		assertFalse(AllActivities.differenceOfTwo(4, 198));
	}
	
	@Test
	void testLowest() {
		for(int i=1; i < 4; i++) {
			for(int k=1; k < 4; k++) {
				for(int p=1; p < 4; p++) {
					int expected = Math.min(Math.min(i, k), p);
					int actual = AllActivities.lowest(i, k, p);
					assertEquals(expected, actual, "highest of "+i+", "+k+", "+p+" should be "+expected);
				}
			}
		}
	}
	
	@Test
	void testDigitCount() {
		assertEquals(2, AllActivities.digitCount(23));
		assertEquals(2, AllActivities.digitCount(-23));
		assertEquals(1, AllActivities.digitCount(1));
		assertEquals(8, AllActivities.digitCount(32930209));
	}
	
	@Test
	void testContainedInSequence() {
		assertTrue(AllActivities.containedInSequence(9592));
		assertTrue(AllActivities.containedInSequence(172));
		assertTrue(AllActivities.containedInSequence(16));
		assertTrue(AllActivities.containedInSequence(105571));
		assertFalse(AllActivities.containedInSequence(105570));
		assertFalse(AllActivities.containedInSequence(105572));
		assertFalse(AllActivities.containedInSequence(0));
		assertFalse(AllActivities.containedInSequence(3));
	}
	
	@Test
	void testPower() {
		assertEquals(1, AllActivities.power(-5, 0));
		assertEquals(-12, AllActivities.power(-12, 1));
		assertEquals(9, AllActivities.power(-3, 2));
		assertEquals(1024, AllActivities.power(-2, 10));
		assertEquals(-2048, AllActivities.power(-2, 11));
	}
	
	@Test
	void testToDecimal() {
		assertEquals(51, AllActivities.toDecimal(110011));
		assertEquals(0, AllActivities.toDecimal(0));
		assertEquals(65, AllActivities.toDecimal(1000001));
		assertEquals(255, AllActivities.toDecimal(11111111));
		assertEquals(2, AllActivities.toDecimal(10));
	}
	
	@Test
	void testMiddleLetter() {
		assertEquals('o', AllActivities.middleLetter("gross"));
		assertEquals('a', AllActivities.middleLetter("whatup"));
		assertEquals('a', AllActivities.middleLetter("hubbabubba"));
		assertEquals('h', AllActivities.middleLetter("hi"));
		assertEquals('i', AllActivities.middleLetter("i"));
	}

}
