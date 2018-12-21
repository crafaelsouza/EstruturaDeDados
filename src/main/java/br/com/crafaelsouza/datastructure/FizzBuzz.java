package br.com.crafaelsouza.datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * --- Directions
 * Write a program that returns the list of numbers as string from 1 to n.]
 * But for multiples of three add “fizz” instead of adding the number and for the
 * multiples of five add “buzz”.
 * For numbers which are multiples of both three and five add “fizzbuzz”.
 * --- Example
 * fizzBuzz(5);
 * ["1", "2", "fizz", "4", "buzz"]
 */
public class FizzBuzz {

	public List<String> solution1(Integer number) {
		List<String> textList = new ArrayList<String>();
		for (int i = 1; i <= number; i++) {
			StringBuilder text = new StringBuilder();
			if (i % 3 == 0) {
				text.append("fizz");
			}
			if (i % 5 == 0) {
				text.append("buzz");
			}
			
			if (text.toString().isEmpty()) {
				textList.add(String.valueOf(i));
			} else {
				textList.add(text.toString());
			}
		}
		return textList;
	}
}
