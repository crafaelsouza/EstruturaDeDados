package br.com.crafaelsouza.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {

	private Palindrome palindrome = new Palindrome();

	@Test
	public void testSoluton1_scenario1() {
		boolean isPalindrome = palindrome.solution1("aba");
		Assert.assertTrue(isPalindrome);
	}

	@Test
	public void testSoluton1_scenario2() {
		boolean isPalindrome = palindrome.solution1("greetings");
		Assert.assertFalse(isPalindrome);
	}

	@Test
	public void testSoluton1_scenario3() {
		boolean isPalindrome = palindrome.solution1("1000000001");
		Assert.assertTrue(isPalindrome);
	}

	@Test
	public void testSoluton1_scenario4() {
		boolean isPalindrome = palindrome.solution1("kayak");
		Assert.assertTrue(isPalindrome);
	}

	@Test
	public void testSoluton2_scenario1() {
		boolean isPalindrome = palindrome.solution1("aba");
		Assert.assertTrue(isPalindrome);
	}

	@Test
	public void testSoluton2_scenario2() {
		boolean isPalindrome = palindrome.solution1("greetings");
		Assert.assertFalse(isPalindrome);
	}

	@Test
	public void testSoluton2_scenario3() {
		boolean isPalindrome = palindrome.solution1("1000000001");
		Assert.assertTrue(isPalindrome);
	}

	@Test
	public void testSoluton2_scenario4() {
		boolean isPalindrome = palindrome.solution1("kayak");
		Assert.assertTrue(isPalindrome);
	}
}
