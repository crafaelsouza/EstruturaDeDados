package br.com.crafaelsouza.datastructure;

/**
 * --- Directions
 * Given a string, return a new string with the reversed order of characters
 * 
 * --- Examples
 * reverse('apple') == 'leppa'
 * reverse('hello') == 'olleh'
 * reverse('Greetings!') == '!sgniteerG'
 *
 */
public class StringReversal {

	public String solution1(String text) {
		String[] strArray = text.split("");
		StringBuilder strReturn = new StringBuilder();
		
		for (int i = strArray.length -1; i >= 0; i--) {
			strReturn.append(strArray[i]);
		}
		
		return strReturn.toString();
	}
	
	public String solution2(String text) {
		return new StringBuilder(text).reverse().toString();
	}

}
