import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleClassificationTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTriangle() {
		int a =1;
		TriangleClassification triangleclassification = new TriangleClassification();
		//À½¼ö
		assertEquals(0,triangleclassification.triangle(-1, 2, 2));
		assertEquals(0,triangleclassification.triangle(2, -1, 2));
		assertEquals(0,triangleclassification.triangle(10, 2, -1));

		//»ï°¢Çü ¸ø¸¸µê
		assertEquals(0,triangleclassification.triangle(10, 2, 2));
		assertEquals(0,triangleclassification.triangle(2, 10, 2));
		assertEquals(0,triangleclassification.triangle(2, 2, 10));
		
		//ÀÌµîº¯,Á¤»ï°¢Çü
		assertEquals(2,triangleclassification.triangle(2, 2, 2));
		assertEquals(1,triangleclassification.triangle(2, 2, 3));
		assertEquals(1,triangleclassification.triangle(2, 3, 2));
		assertEquals(1,triangleclassification.triangle(3, 2, 2));
		
		//Á÷°¢
		assertEquals(3,triangleclassification.triangle(3, 4, 5));
		assertEquals(3,triangleclassification.triangle(3, 5, 4));
		assertEquals(3,triangleclassification.triangle(5, 3, 4));
		
		//»ï°¢Çü
		assertEquals(4,triangleclassification.triangle(6, 3, 4));
		
	}

}
