package br.com.crafaelsouza.datastructure;


/**
 * --- Directions
 * Given a string, return true if the string is a palindrome
 * or false if it is not.  Palindromes are strings that
 * form the same word if it is reversed. *Do* include spaces
 * and punctuation in determining if the string is a palindrome.
 * 
 * --- Examples:
 * palindrome("abba") == true
 * palindrome("abcdefg") == false
*/
public class Palindrome {

	public boolean solution1(String text) {
		String[] strArray = text.split("");
		StringBuilder strReturn = new StringBuilder();
		
		for (int i = strArray.length -1; i >= 0; i--) {
			strReturn.append(strArray[i]);
		}
		
		return strReturn.toString().equals(text);
	}
	
	public boolean soltuion2(String text) {
		return new StringBuilder(text).reverse().toString().equals(text);
	}

}
