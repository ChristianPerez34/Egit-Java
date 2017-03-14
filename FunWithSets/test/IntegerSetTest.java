import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerSetTest {
	
	IntegerSet s = new IntegerSet(10);
	IntegerSet singleton = new IntegerSet(1);

	@Test
	public void testIsMember() {
		assertFalse("isMember: incorectly returns true", s.isMember(5));
	}
	
	@Test
	public void testAdd(){
		s.add(5);
		assertTrue("isMember: incorrectly return false", s.isMember(5));
	}
	
	@Test
	public void testAddFull(){
		singleton.add(5);
		singleton.add(6);
		assertTrue("isMember: incorrectly return false", singleton.isMember(5));
		assertTrue("isMember: incorrectly return false", singleton.isMember(6));
		assertFalse("isMember: incorrectly return true", singleton.isMember(7));
	}

}
