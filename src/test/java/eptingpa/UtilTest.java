package eptingpa;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class UtilTest extends TestCase {

	public void testistErstesHalbjahr() {
		final int[] eingabeArray = {-1, 0, 1, 6, 7, 11, 12, 13};
		for(int i = 0; i <= eingabeArray.length; ++i)
		{
		assertTrue(Util.istErstesHalbjahr(eingabeArray[i]));
	    }
	}
	
}
