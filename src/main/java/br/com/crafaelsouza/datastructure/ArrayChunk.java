package br.com.crafaelsouza.datastructure;

import java.util.Arrays;

/**
 * --- Directions
 * Given an array and chunk size, divide the array into many subarrays
 * where each subarray is of length size
 * --- Examples
 * chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
 * chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
 * chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
 * chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
 * chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]
 *
 */
public class ArrayChunk {

	public int[][] solution1(int[] array, int size) {
		
		int[][] finalArray = new int[(int) Math.ceil((double) array.length / size)][];
		
		int index = 0;
		int indexFinalArray = 0;
		
		while (index < array.length) {
			int newIndex = index + size;
			if (newIndex > array.length) {
				newIndex = array.length;
			}
			int[] subArray = Arrays.copyOfRange(array, index, newIndex);
			finalArray[indexFinalArray++] = subArray;
			index = newIndex;
		}
		return finalArray;
	}

	
}
