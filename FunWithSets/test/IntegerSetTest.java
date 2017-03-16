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
		s.delete(5);
	}
	
	@Test
	public void testAddFull(){
		singleton.add(5);
		singleton.add(6);
		assertTrue("isMember: incorrectly return false", singleton.isMember(5));
		assertTrue("isMember: incorrectly return false", singleton.isMember(6));
		assertFalse("isMember: incorrectly return true", singleton.isMember(7));
		singleton.delete(5);
		singleton.delete(6);
	}
	
	@Test
	public void testDelete(){
		s.add(10);
		s.add(11);
		s.delete(11);
		assertFalse("Delete: incorrectly returns true",s.isMember(11));
		s.delete(10);
	}
	
	@Test
	public void testSum(){
		s.add(1);
		s.add(2);
		s.add(3);
		s.sum();
		assertTrue("Sum: icorrectly returns false", s.sum() == 6);
		s.delete(1);
		s.delete(2);
		s.delete(3);
	}
	
	@Test
	public void testAllEven(){
		s.add(1);
		s.add(2);
		s.add(3);
		s.allEven();
		assertFalse("AllEven: incorrectly returns true", s.allEven());
		s.delete(1);
		s.delete(2);
		s.delete(3);
		s.add(2);
		s.add(4);
		s.add(6);
		assertTrue("AllEven: incorrectly returns false", s.allEven());
		s.delete(2);
		s.delete(4);
		s.delete(6);
	}

}
