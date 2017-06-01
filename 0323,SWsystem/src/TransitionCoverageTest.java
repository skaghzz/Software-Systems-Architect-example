import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TransitionCoverageTest {
	/*
	 * Test : T1(constructor with no parameter)
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
	 * Test : T1(constructor with char)
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
	 * Test : T1(constructor with char)
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
	 * Test : T1(constructor with char)
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
	 * Test : T1(constructor with char)
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
	 * Test : T1(constructor with char)
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
	 * Test : T1(constructor with char)
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
	 * Test : T1(constructor with char)
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
	 * Test : T1(constructor with char)
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
	 * Test : T1(constructor with char)
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
	 * Test : T1(constructor with char)
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
	 * Test : T1(constructor with char)
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
	 * Test : T1(constructor with char)
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
	 * Test : T1(constructor with string)
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
	 * Test : T3(push char when size is over 0 under MAX)
	 * input : 'a'
	 * precondition : size < MAX -1
	 * expected : size = presize + 1
	 */
	@Test
	public void testPushInputaWhenSizeZeroToMax(){
		StringStack stringstack = new StringStack();
		stringstack.push('a');
		final int expectedPreSize = stringstack.getSize()+1;
		assertTrue("size is not under MAX",stringstack.getSize() < stringstack.getMaxSize()-1);
		stringstack.push('z');
		assertEquals("size is not increased ",expectedPreSize,stringstack.getSize());
	}
	
	/*
	 * Test : T3(push char when size is over 0 under MAX)
	 * input : 'z'
	 * precondition : size < MAX -1
	 * expected : size = presize + 1
	 */
	@Test
	public void testPushInputzWhenSizeZeroToMax(){
		StringStack stringstack = new StringStack();
		stringstack.push('z');
		final int expectedPreSize = stringstack.getSize()+1;
		assertTrue("size is not under MAX",stringstack.getSize() < stringstack.getMaxSize()-1);
		stringstack.push('z');
		assertEquals("size is not increased ",expectedPreSize,stringstack.getSize());
	}
	/*
	 * Test : T3(push char when size is over 0 under MAX)
	 * input : 'A'
	 * precondition : size < MAX -1
	 * expected : size = presize + 1
	 */
	@Test
	public void testPushInputAWhenSizeZeroToMax(){
		StringStack stringstack = new StringStack();
		stringstack.push('A');
		final int expectedPreSize = stringstack.getSize()+1;
		assertTrue("size is not under MAX",stringstack.getSize() < stringstack.getMaxSize()-1);
		stringstack.push('A');
		assertEquals("size is not increased ",expectedPreSize,stringstack.getSize());
	}
	/*
	 * Test : T3(push char when size is over 0 under MAX)
	 * input : 'Z'
	 * precondition : size < MAX -1
	 * expected : size = presize + 1
	 */
	@Test
	public void testPushInputZWhenSizeZeroToMax(){
		StringStack stringstack = new StringStack();
		stringstack.push('Z');
		final int expectedPreSize = stringstack.getSize()+1;
		assertTrue("size is not under MAX",stringstack.getSize() < stringstack.getMaxSize()-1);
		stringstack.push('Z');
		assertEquals("size is not increased ",expectedPreSize,stringstack.getSize());
	}
	/*
	 * Test : T3(push char when size is over 0 under MAX)
	 * input : '0'
	 * precondition : size < MAX -1
	 * expected : size = presize + 1
	 */
	@Test
	public void testPushInput0WhenSizeZeroToMax(){
		StringStack stringstack = new StringStack();
		stringstack.push('0');
		final int expectedPreSize = stringstack.getSize()+1;
		assertTrue("size is not under MAX",stringstack.getSize() < stringstack.getMaxSize()-1);
		stringstack.push('0');
		assertEquals("size is not increased ",expectedPreSize,stringstack.getSize());
	}
	/*
	 * Test : T3(push char when size is over 0 under MAX)
	 * input : '9'
	 * precondition : size < MAX -1
	 * expected : size = presize + 1
	 */
	@Test
	public void testPushInput9WhenSizeZeroToMax(){
		StringStack stringstack = new StringStack();
		stringstack.push('9');
		final int expectedPreSize = stringstack.getSize()+1;
		assertTrue("size is not under MAX",stringstack.getSize() < stringstack.getMaxSize()-1);
		stringstack.push('9');
		assertEquals("size is not increased ",expectedPreSize,stringstack.getSize());
	}
	/*
	 * Test : T3(push Invalid char when size is over 0 under MAX)
	 * input : '/'
	 * precondition : size < MAX -1
	 * expected : size = presize
	 */
	@Test
	public void testPushInvalidWhenSizeZeroToMax1(){
		StringStack stringstack = new StringStack();
		stringstack.push('a');
		final int expectedPreSize = stringstack.getSize();
		assertTrue("size is not under MAX",stringstack.getSize() < stringstack.getMaxSize()-1);
		stringstack.push('/');
		assertEquals("size is increased ",expectedPreSize,stringstack.getSize());
	}
	/*
	 * Test : T3(push Invalid char when size is over 0 under MAX)
	 * input : ':'
	 * precondition : size < MAX -1
	 * expected : size = presize
	 */
	@Test
	public void testPushInvalidWhenSizeZeroToMax2(){
		StringStack stringstack = new StringStack();
		stringstack.push('a');
		final int expectedPreSize = stringstack.getSize();
		assertTrue("size is not under MAX",stringstack.getSize() < stringstack.getMaxSize()-1);
		stringstack.push(':');
		assertEquals("size is increased ",expectedPreSize,stringstack.getSize());
	}
	/*
	 * Test : T3(push Invalid char when size is over 0 under MAX)
	 * input : '@'
	 * precondition : size < MAX -1
	 * expected : size = presize
	 */
	@Test
	public void testPushInvalidWhenSizeZeroToMax3(){
		StringStack stringstack = new StringStack();
		stringstack.push('a');
		final int expectedPreSize = stringstack.getSize();
		assertTrue("size is not under MAX",stringstack.getSize() < stringstack.getMaxSize()-1);
		stringstack.push('@');
		assertEquals("size is increased ",expectedPreSize,stringstack.getSize());
	}
	/*
	 * Test : T3(push Invalid char when size is over 0 under MAX)
	 * input : '['
	 * precondition : size < MAX -1
	 * expected : size = presize
	 */
	@Test
	public void testPushInvalidWhenSizeZeroToMax4(){
		StringStack stringstack = new StringStack();
		stringstack.push('a');
		final int expectedPreSize = stringstack.getSize();
		assertTrue("size is not under MAX",stringstack.getSize() < stringstack.getMaxSize()-1);
		stringstack.push('[');
		assertEquals("size is increased ",expectedPreSize,stringstack.getSize());
	}
	/*
	 * Test : T3(push Invalid char when size is over 0 under MAX)
	 * input : '''
	 * precondition : size < MAX -1
	 * expected : size = presize
	 */
	@Test
	public void testPushInvalidWhenSizeZeroToMax5(){
		StringStack stringstack = new StringStack();
		stringstack.push('a');
		final int expectedPreSize = stringstack.getSize();
		assertTrue("size is not under MAX",stringstack.getSize() < stringstack.getMaxSize()-1);
		stringstack.push('\'');
		assertEquals("size is increased ",expectedPreSize,stringstack.getSize());
	}
	/*
	 * Test : T3(push Invalid char when size is over 0 under MAX)
	 * input : '{'
	 * precondition : size < MAX -1
	 * expected : size = presize
	 */
	@Test
	public void testPushInvalidWhenSizeZeroToMax6(){
		StringStack stringstack = new StringStack();
		stringstack.push('a');
		final int expectedPreSize = stringstack.getSize();
		assertTrue("size is not under MAX",stringstack.getSize() < stringstack.getMaxSize()-1);
		stringstack.push('{');
		assertEquals("size is increased ",expectedPreSize,stringstack.getSize());
	}
	/*
	 * Test : T4(push when size is MAX-1)
	 * precondition : size < MAX -1
	 */
	@Test
	public void testPushWhenSizeMaxMinusOne(){
		StringStack stringstack = new StringStack();
		for(int i = 0; i < stringstack.getMaxSize()-1; i++){
			stringstack.push('a');			
		}
		assertTrue("size is not MAX-1",stringstack.getMaxSize()-1 == stringstack.getSize());
		stringstack.push('a');
	}
	/*
	 * Test : T5(pop when size is MAX-1)
	 * expected : size < MAX -1
	 */
	@Test
	public void testPopWhenSizeMaxMinusOne(){
		StringStack stringstack = new StringStack();
		for(int i = 0; i < stringstack.getMaxSize(); i++){
			stringstack.push('a');			
		}
		stringstack.pop();
		assertTrue("size is not MAX-1",stringstack.getMaxSize()-1 == stringstack.getSize());
	}
	/*
	 * Test : T6(pop when size is over 1)
	 * precondition : 1 < size
	 * expected : size = presize - 1
	 */
	@Test
	public void testPopWhenSizeOverOne(){
		StringStack stringstack = new StringStack();
		stringstack.push('a');
		stringstack.push('a');
		final int expectedPreSize = stringstack.getSize()-1;
		assertTrue("size is not over 1",1 < stringstack.getSize());
		stringstack.pop();
		assertEquals("size is decreased",expectedPreSize,stringstack.getSize());
	}
	/*
	 * Test : T7(pop when size is 1)
	 * precondition : 1 = size
	 */
	@Test
	public void testPopWhenSizeOne(){
		final int expectedSize = 1;
		StringStack stringstack = new StringStack();
		stringstack.push('a');
		assertEquals("size is not one",expectedSize,stringstack.getSize());
		stringstack.pop();
	}
}