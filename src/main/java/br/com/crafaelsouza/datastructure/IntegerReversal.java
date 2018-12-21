package br.com.crafaelsouza.datastructure;

/**
 * --- Directions
 * Given an integer, return an integer that is the reverse
 * ordering of numbers.
 * --- Examples
 * reverseInt(15) == 51
 * reverseInt(981) == 189
 * reverseInt(500) == 5
 * reverseInt(-15) == -51
 * reverseInt(-90) == -9
 * 	
 */
public class IntegerReversal {

	public int solution1(int number) {
		String str = String.valueOf(number);
		String strReversed = new StringBuilder(str).reverse().toString();
		int reversedNumber = Integer.parseInt(strReversed.replace("-", ""));
		return (int) (reversedNumber * Math.signum(number));
	}

	public int solution2(int number) {
		return Integer.reverse(number);
	}
}
