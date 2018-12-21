package br.com.crafaelsouza.datastructure;

import org.junit.Assert;
import org.junit.Test;


public class ChuckArrayTest {

	private ArrayChunk arrayChunk = new ArrayChunk();
	
	@Test
	public void testeSolution1_scenario1() {
		int[] array = new int[] {1, 2, 3, 4};
		int[][] chunkedArray = arrayChunk.solution1(array , 2);
		Assert.assertEquals(2, chunkedArray.length);
		Assert.assertEquals(1, chunkedArray[0][0]);
		Assert.assertEquals(2, chunkedArray[0][1]);
		Assert.assertEquals(3, chunkedArray[1][0]);
		Assert.assertEquals(4, chunkedArray[1][1]);
	}
	
	@Test
	public void testeSolution1_scenario2() {
		int[] array = new int[] {1, 2, 3, 4, 5};
		int[][] chunkedArray = arrayChunk.solution1(array , 2);
		Assert.assertEquals(3, chunkedArray.length);
		Assert.assertEquals(1, chunkedArray[0][0]);
		Assert.assertEquals(2, chunkedArray[0][1]);
		Assert.assertEquals(3, chunkedArray[1][0]);
		Assert.assertEquals(4, chunkedArray[1][1]);
		Assert.assertEquals(5, chunkedArray[2][0]);
	}
	
	@Test
	public void testeSolution1_scenario3() {
		int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
		int[][] chunkedArray = arrayChunk.solution1(array , 3);
		Assert.assertEquals(3, chunkedArray.length);
		Assert.assertEquals(1, chunkedArray[0][0]);
		Assert.assertEquals(2, chunkedArray[0][1]);
		Assert.assertEquals(3, chunkedArray[0][2]);
		Assert.assertEquals(4, chunkedArray[1][0]);
		Assert.assertEquals(5, chunkedArray[1][1]);
		Assert.assertEquals(6, chunkedArray[1][2]);
		Assert.assertEquals(7, chunkedArray[2][0]);
		Assert.assertEquals(8, chunkedArray[2][1]);
	}
}
