package eptingpa;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class UtilTest extends TestCase {

	public void testistErstesHalbjahr() {
		final int[] eingabeArray = {6, 7, 8};
		for(int i = 0; i < eingabeArray.length; ++i)
		{
		assertTrue("Fehler mit Eingabe " + eingabeArray[i],Util.istErstesHalbjahr(eingabeArray[i]));
	    }
	}
	
}
