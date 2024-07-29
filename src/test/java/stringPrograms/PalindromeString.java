package stringPrograms;

import org.testng.annotations.Test;

public class PalindromeString {

	@Test
	public void m1() {
		String s1 = "PavaP";
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			s2 = s1.charAt(i) + s2;
		}
		boolean b = true;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				b = false;
				break;
			}
		}
		if (b) {
			System.out.println("Given String is palindrome");
		} else {
			System.out.println("Given String is not palindrome");
		}
	}

	@Test
	public void m2() {
		String s1 = "Pavan";
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			s2 = s1.charAt(i) + s2;
		}
		if (s1.equals(s2)) {
			System.out.println("Given String is palindrome");
		} else {
			System.out.println("Given String is not palindrome");
		}
	}
}