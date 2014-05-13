package eptingpa;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class UtilTest extends TestCase {

	public void testistErstesHalbjahr() {
		final int eingabe = 5;
		assertTrue(Util.istErstesHalbjahr(eingabe));
	}
	
}
