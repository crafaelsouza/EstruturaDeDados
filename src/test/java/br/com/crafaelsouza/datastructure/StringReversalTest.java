package br.com.crafaelsouza.datastructure;

import org.junit.Assert;
import org.junit.Test;


public class StringReversalTest {

	private StringReversal stringReversal = new StringReversal();
	
	@Test
	public void testSolution1() {
		String reversedString = stringReversal.solution1("abcd");
		Assert.assertEquals("dcba", reversedString);
	}
	
	@Test
	public void testSolution2() {
		String reversedString = stringReversal.solution2("abcd");
		Assert.assertEquals("dcba", reversedString);
	}
}
