package unitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import junit.textui.TestRunner;

public class TestCalculator extends TestCase{
	
	public TestCalculator() {
		super();
	}
	int x;
	int y;
	
	/*@Test
	public void testAddMethod() {
		int x = 10;
		int y = 20;
		Calculator c = new Calculator(x,y);
		int result = c.addMethod();
		assertEquals(30,result);
	}
	
	@Test
	public void testSubMethod() {
		int x = 10;
		int y = 20;
		Calculator c = new Calculator(x,y);
		int greater = c.isGreater();
		assertEquals(1,greater);
		int result = c.subMethod();
		assertEquals(10,result);
	}*/

	protected void setUp() throws Exception
	{
		super.setUp();
		System.out.println("Initialize method");
		x=10;
		y=20;
	}
	
	protected void tearDown() throws Exception
	{
		super.tearDown();
		System.out.println("Cleanup method");
		
	}
	
	@Test
	public void testAddMethod() {
		System.out.println("Add");
	
		Calculator c = new Calculator(x,y);
		int result = c.addMethod();
		assertEquals(30,result);
	}
	
	
	
	public static void main(String[] args)
	{
		TestRunner.run(TestCalculator.class);
	}
}
