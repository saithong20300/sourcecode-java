import static org.junit.Assert.*;

import org.junit.Test;

public class IsogrammTest {

	@Test
	public void testTrue() {
		Isogram isogram =new Isogram();
		assertTrue(isogram.check("lumberacks"));
	}

	@Test
	public void testFalse() {
		Isogram isogram = new Isogram();
		assertFalse(isogram.check("Chalermchat"));
	}


}
