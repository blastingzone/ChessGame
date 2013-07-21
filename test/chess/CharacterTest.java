package chess;

import junit.framework.TestCase;

public class CharacterTest extends TestCase {
	public void testWhitespace() throws Exception {
		boolean result = Character.isWhitespace(' ');
		assertTrue(result);
		result = Character.isWhitespace('\n');
		assertTrue(result);
		result = Character.isWhitespace('\t');
		assertTrue(result);
		result = Character.isWhitespace('a');
		assertFalse(result);
		//Unicode ('\u3000'), ('\u2028'), ('\u2029') ... etc return True
		result = Character.isWhitespace('\u3000');
		assertTrue(result);
		result = Character.isWhitespace('\u0009');
		assertTrue(result);
	}
}
