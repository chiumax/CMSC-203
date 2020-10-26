import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	private GradeBook g1;
	private GradeBook g2;
	
	// task 2 generate tests for every method except constructor
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(5);
		g1.addScore(50);
		g1.addScore(39);
		
		g2.addScore(80);
		g2.addScore(20);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
	}

	@Test
	void testSum() {
	}

	@Test
	void testMinimum() {
	}

	@Test
	void testFinalScore() {

	}

	@Test
	void testGetScoreSize() {
	}

	@Test
	void testToString() {
	}
	
	// task 4
	
	@Test
	public void addScore() {
		assertTrue(g1.toString().equals("5.0 50.0 39.0 0.0 0.0 "));
		assertTrue(g2.toString().equals("80.0 20.0 0.0 0.0 0.0 "));

		assertEquals(g1.getScoreSize(), 3);
		assertEquals(g2.getScoreSize(), 2);
		
	}
	
	@Test
	public void sum() {
		assertEquals(g1.sum(), 94);
		assertEquals(g2.sum(), 100);
		
	}
	
	@Test
	public void minimum() {
		assertEquals(g1.minimum(), 5);
		assertEquals(g2.minimum(), 20);
		
	}
	
	@Test
	public void finalScore() {
		assertEquals(g1.finalScore(), 89);
		assertEquals(g2.finalScore(), 80);
	}

}
