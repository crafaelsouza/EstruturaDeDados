package br.com.crafaelsouza.datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * --- Directions
 * Given a string, return the character that is most commonly used in the string.
 * --- Examples
 * maxChar("abcccccccd") === "c"
 * maxChar("apple 1231111") === "1"
 *
 */
public class MaxChar {

	public String findMaxChar(String text) {
		
		Map<String, Integer> mapChars = new HashMap<String, Integer>();
		int max = 0;
		String maxChar = null;
		
		for (String element : text.split("")) {
			if (mapChars.containsKey(element)) {
				mapChars.put(element, mapChars.get(element) + 1);
			} else {
				mapChars.put(element, 1);
			}
		}
		
		for (Entry<String, Integer> element : mapChars.entrySet()) {
			if (element.getValue() > max) {
				max = element.getValue();
				maxChar = element.getKey();
			}
		}
		
		return maxChar;
	}
}
