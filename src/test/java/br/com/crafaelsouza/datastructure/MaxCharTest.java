package br.com.crafaelsouza.datastructure;

import org.junit.Assert;
import org.junit.Test;


public class MaxCharTest {

	private MaxChar maxChar = new MaxChar();
	
	@Test
	public void testSolution1_scenario1() {
		String value = maxChar.findMaxChar("a");
		Assert.assertEquals("a", value);
	}
	
	@Test
	public void testSolution1_scenario2() {
		String value = maxChar.findMaxChar("ab1c1d1e1f1g1");
		Assert.assertEquals("1", value);
	}
	
	@Test
	public void testSolution1_scenario3() {
		String value = maxChar.findMaxChar("abcccccccd");
		Assert.assertEquals("c", value);
	}
	
	@Test
	public void testSolution1_scenario4() {
		String value = maxChar.findMaxChar("apple 1231111");
		Assert.assertEquals("1", value);
	}
	
}
