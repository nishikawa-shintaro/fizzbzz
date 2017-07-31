package fizzbuzz.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	public void testMain_01() {
		System.out.println("testMain_01");
		assertEquals("Fizz",FizzBuzz.fizzBuzz(3));
	}
	@Test
	public void testMain_02(){
		System.out.println("testMain_02");
		assertEquals("Buzz",FizzBuzz.fizzBuzz(5));
	}
	@Test
	public void testMain_03(){
		System.out.println("testMain_03");
		assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(15));
	}
	@Test
	public void testMain_04(){
		System.out.println("testMain_04");
		assertEquals("11",FizzBuzz.fizzBuzz(11));
	}

}
