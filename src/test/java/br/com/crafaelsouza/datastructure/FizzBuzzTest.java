package br.com.crafaelsouza.datastructure;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class FizzBuzzTest {

	private FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test
	public void testSolution1_scenario1() {
		List<String> returnedList = fizzBuzz.solution1(5);
		Assert.assertNotNull(returnedList);
		Assert.assertEquals(5, returnedList.size());
		
		Assert.assertEquals("1", returnedList.get(0));
		Assert.assertEquals("2", returnedList.get(1));
		Assert.assertEquals("fizz", returnedList.get(2));
		Assert.assertEquals("4", returnedList.get(3));
		Assert.assertEquals("buzz", returnedList.get(4));
	}
	
	@Test
	public void testSolution1_scenario2() {
		List<String> returnedList = fizzBuzz.solution1(15);
		Assert.assertNotNull(returnedList);
		Assert.assertEquals(15, returnedList.size());
		
		Assert.assertEquals("1", returnedList.get(0));
		Assert.assertEquals("2", returnedList.get(1));
		Assert.assertEquals("fizz", returnedList.get(2));
		Assert.assertEquals("4", returnedList.get(3));
		Assert.assertEquals("buzz", returnedList.get(4));
		Assert.assertEquals("fizz", returnedList.get(5));
		Assert.assertEquals("7", returnedList.get(6));
		Assert.assertEquals("8", returnedList.get(7));
		Assert.assertEquals("fizz", returnedList.get(8));
		Assert.assertEquals("buzz", returnedList.get(9));
		Assert.assertEquals("11", returnedList.get(10));
		Assert.assertEquals("fizz", returnedList.get(11));
		Assert.assertEquals("13", returnedList.get(12));
		Assert.assertEquals("14", returnedList.get(13));
		Assert.assertEquals("fizzbuzz", returnedList.get(14));
	}
	
	@Test
	public void testSolution2() {
		List<String> returnedList = fizzBuzz.solution1(5);
		Assert.assertNotNull(returnedList);
		Assert.assertEquals(5, returnedList.size());
	}
}
