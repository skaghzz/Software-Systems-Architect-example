import static org.junit.Assert.*;
import org.junit.Test;

public class StateCoverageTest {
	/*
	 * Test : S1(constructor with no parameter)
	 * expected : size = 0
	 */
	@Test
	public void testConstructor(){
		final int expectedSize = 0;
		StringStack stringstack = new StringStack();
		assertEquals("size of stack is not zero.",expectedSize,stringstack.getSize());
		assertTrue("stack is not Empty",stringstack.isEmpty());
		
	}
	
	/*
	 * Test : S1(constructor with char)
	 * input : 'a'
	 * expected : size = 0
	 */
	@Test
	public void testConstructorCharInputa(){
		final int expectedSize = 0;
		StringStack stringstack = new StringStack('a');
		assertEquals("size of stack is not zero.",expectedSize,stringstack.getSize());
		assertTrue("stack is not Empty",stringstack.isEmpty());
	}
	
	/*
	 * Test : S1(constructor with char)
	 * input : 'z'
	 * expected : size = 0
	 */
	@Test
	public void testConstructorCharInputz(){
		final int expectedSize = 0;
		StringStack stringstack = new StringStack('z');
		assertEquals("size of stack is not zero.",expectedSize,stringstack.getSize());
		assertTrue("stack is not Empty",stringstack.isEmpty());
	}
	
	/*
	 * Test : S1(constructor with char)
	 * input : 'A'
	 * expected : size = 0
	 */
	@Test
	public void testConstructorCharInputA(){
		final int expectedSize = 0;
		StringStack stringstack = new StringStack('A');
		assertEquals("size of stack is not zero.",expectedSize,stringstack.getSize());
		assertTrue("stack is not Empty",stringstack.isEmpty());
	}
	
	/*
	 * Test : S1(constructor with char)
	 * input : 'Z'
	 * expected : size = 0
	 */
	@Test
	public void testConstructorCharInputZ(){
		final int expectedSize = 0;
		StringStack stringstack = new StringStack('Z');
		assertEquals("size of stack is not zero.",expectedSize,stringstack.getSize());
		assertTrue("stack is not Empty",stringstack.isEmpty());
	}
	
	/*
	 * Test : S1(constructor with char)
	 * input : '0'
	 * expected : size = 0
	 */
	@Test
	public void testConstructorCharInput0(){
		final int expectedSize = 0;
		StringStack stringstack = new StringStack('0');
		assertEquals("size of stack is not zero.",expectedSize,stringstack.getSize());
		assertTrue("stack is not Empty",stringstack.isEmpty());
	}
	
	/*
	 * Test : S1(constructor with char)
	 * input : '9'
	 * expected : size = 0
	 */
	@Test
	public void testConstructorCharInput9(){
		final int expectedSize = 0;
		StringStack stringstack = new StringStack('9');
		assertEquals("size of stack is not zero.",expectedSize,stringstack.getSize());
		assertTrue("stack is not Empty",stringstack.isEmpty());
	}
	
	/*
	 * Test : S1(constructor with char)
	 * input : '/'
	 * expected : size = 0
	 */
	@Test
	public void testConstructorCharInputNotLetter1(){
		final int expectedSize = 0;
		StringStack stringstack = new StringStack('/');
		assertEquals("size of stack is not zero.",expectedSize,stringstack.getSize());
		assertTrue("stack is not Empty",stringstack.isEmpty());
	}
	
	/*
	 * Test : S1(constructor with char)
	 * input : ':'
	 * expected : size = 0
	 */
	@Test
	public void testConstructorCharInputNotLetter2(){
		final int expectedSize = 0;
		StringStack stringstack = new StringStack(':');
		assertEquals("size of stack is not zero.",expectedSize,stringstack.getSize());
		assertTrue("stack is not Empty",stringstack.isEmpty());
	}

	/*
	 * Test : S1(constructor with char)
	 * input : '@'
	 * expected : size = 0
	 */
	@Test
	public void testConstructorCharInputNotLetter3(){
		final int expectedSize = 0;
		StringStack stringstack = new StringStack('@');
		assertEquals("size of stack is not zero.",expectedSize,stringstack.getSize());
		assertTrue("stack is not Empty",stringstack.isEmpty());
	}
	
	/*
	 * Test : S1(constructor with char)
	 * input : '['
	 * expected : size = 0
	 */
	@Test
	public void testConstructorCharInputNotLetter4(){
		final int expectedSize = 0;
		StringStack stringstack = new StringStack('[');
		assertEquals("size of stack is not zero.",expectedSize,stringstack.getSize());
		assertTrue("stack is not Empty",stringstack.isEmpty());
	}
	
	/*
	 * Test : S1(constructor with char)
	 * input : '''
	 * expected : size = 0
	 */
	@Test
	public void testConstructorCharInputNotLetter5(){
		final int expectedSize = 0;
		StringStack stringstack = new StringStack('\'');
		assertEquals("size of stack is not zero.",expectedSize,stringstack.getSize());
		assertTrue("stack is not Empty",stringstack.isEmpty());
	}
	
	/*
	 * Test : S1(constructor with char)
	 * input : '{'
	 * expected : size = 0
	 */
	@Test
	public void testConstructorCharInputNotLetter6(){
		final int expectedSize = 0;
		StringStack stringstack = new StringStack('{');
		assertEquals("size of stack is not zero.",expectedSize,stringstack.getSize());
		assertTrue("stack is not Empty",stringstack.isEmpty());
	}
	
	/*
	 * Test : S1(constructor with string)
	 * expected : size = 0
	 */
	@Test
	public void testConstructorString(){
		final int expectedSize = 0;
		StringStack stringstack = new StringStack("aa");
		assertEquals("size of stack is not zero.",expectedSize,stringstack.getSize());
		assertTrue("stack is not Empty",stringstack.isEmpty());
	}
	
	/*
	 * Test : S1(constructor after Pop Size one)
	 * expected : size = 0
	 */
	@Test
	public void testConstructorAfterPopSizeOne(){
		final int expectedSize = 0;
		StringStack stringstack = new StringStack();
		stringstack.push('a');
		stringstack.pop();
		assertEquals("size of stack is not zero.",expectedSize,stringstack.getSize());
		assertTrue("stack is not Empty",stringstack.isEmpty());
	}
	
	/*
	 * Test : S2(push when size is 0)
	 * expected out : 0 < size and size < MAX
	 */
	@Test
	public void testPushWhenSizeZero(){
		StringStack stringstack = new StringStack();
		stringstack.push('a');
		assertTrue("size of stack is less than 0",0 < stringstack.getSize());
		assertTrue("size of stack is over MAX",stringstack.getSize() < stringstack.getMaxSize());
	}

	/*
	 * Test : S2(push when size is over 0 under MAX)
	 * expected out : 0 < size and size < MAX
	 */
	@Test
	public void testPushWhenSizeZeroToMax(){
		StringStack stringstack = new StringStack();
		stringstack.push('a');
		stringstack.push('b');
		assertTrue("size of stack is less than 0",0 < stringstack.getSize());
		assertTrue("size of stack is over MAX",stringstack.getSize() < stringstack.getMaxSize());
	}
	
	/*
	 * Test : S2(pop when size is MAX)
	 * expected out : 0 < size and size < MAX
	 */
	@Test
	public void testPopWhenSizeMax(){
		StringStack stringstack = new StringStack();
		for(int i = 0; i < stringstack.getMaxSize(); i++){
			stringstack.push('a');	
		}
		stringstack.pop();
		assertTrue("size of stack is less than 0",0 < stringstack.getSize());
		assertTrue("size of stack is over MAX",stringstack.getSize() < stringstack.getMaxSize());
	}
	
	/*
	 * Test : S2(pop when size is over 0 under MAX)
	 * expected out : 0 < size and size < MAX
	 */
	@Test
	public void testPopWhenSizeZeroToMax(){
		StringStack stringstack = new StringStack();
		stringstack.push('a');
		stringstack.push('a');
		stringstack.push('a');
		stringstack.pop();
		assertTrue("size of stack is less than 0",0 < stringstack.getSize());
		assertTrue("size of stack is over MAX",stringstack.getSize() < stringstack.getMaxSize());
	}
	
	/*
	 * Test : S3(push when size is MAX-1)
	 * expected out : size : MAX
	 */
	@Test
	public void testSizeMax(){
		StringStack stringstack = new StringStack();
		for(int i = 0; i < stringstack.getMaxSize()-1; i++){
			stringstack.push('c');
		}
		stringstack.push('c');
		assertTrue("size of stack is not MAX",stringstack.getSize() == stringstack.getMaxSize());
		assertTrue("stack is not full",stringstack.isFull());
	}
}
