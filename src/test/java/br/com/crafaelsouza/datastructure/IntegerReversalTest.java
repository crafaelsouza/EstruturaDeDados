package br.com.crafaelsouza.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class IntegerReversalTest {

	private IntegerReversal integerReversal = new IntegerReversal();
	
	@Test
	public void testSolution1_scenario1() {
		int reversedInt = integerReversal.solution1(0);
		Assert.assertEquals(0, reversedInt);
	}
	
	@Test
	public void testSolution1_scenario2() {
		int reversedInt = integerReversal.solution1(15);
		Assert.assertEquals(51, reversedInt);
	}
	
	@Test
	public void testSolution1_scenario3() {
		int reversedInt = integerReversal.solution1(90);
		Assert.assertEquals(9, reversedInt);
	}
	
	@Test
	public void testSolution1_scenario4() {
		int reversedInt = integerReversal.solution1(-90);
		Assert.assertEquals(-9, reversedInt);
	}
	
	@Test
	public void testSolution1_scenario5() {
		int reversedInt = integerReversal.solution1(-15);
		Assert.assertEquals(-51, reversedInt);
	}
	
	@Test
	public void testSolution1_scenario6() {
		int reversedInt = integerReversal.solution1(-12345);
		Assert.assertEquals(-54321, reversedInt);
	}
	
	
	@Test
	public void testSolution2_scenario1() {
		int reversedInt = integerReversal.solution1(0);
		Assert.assertEquals(0, reversedInt);
	}
	
	@Test
	public void testSolution2_scenario2() {
		int reversedInt = integerReversal.solution1(15);
		Assert.assertEquals(51, reversedInt);
	}
	
	@Test
	public void testSolution2_scenario3() {
		int reversedInt = integerReversal.solution1(90);
		Assert.assertEquals(9, reversedInt);
	}
	
	@Test
	public void testSolution2_scenario4() {
		int reversedInt = integerReversal.solution1(-90);
		Assert.assertEquals(-9, reversedInt);
	}
	
	@Test
	public void testSolution2_scenario5() {
		int reversedInt = integerReversal.solution1(-15);
		Assert.assertEquals(-51, reversedInt);
	}
	
	@Test
	public void testSolution2_scenario6() {
		int reversedInt = integerReversal.solution1(-12345);
		Assert.assertEquals(-54321, reversedInt);
	}
}
