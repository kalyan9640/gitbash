package POJO_CLASS_PRACTICE;

import org.testng.annotations.Test;

public class AnagramFor {
	@Test
	public void m1() {
		String s1 = "racee";
		String s2 = "caree";
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					count++;
				}
			}
		}
		if (count == s1.length()) {
			System.out.println("anagram ");
		} else {
			System.out.println("not anagram");
		}
	}
}
