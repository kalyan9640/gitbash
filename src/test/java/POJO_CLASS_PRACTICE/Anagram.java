package POJO_CLASS_PRACTICE;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Anagram {

	@Test
	public void m1() {
		String s1 = "pavana";
		String s2 = "avanpa";

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		System.out.println(Arrays.equals(c1, c2) ? "anagram" : "not anagram");

	}
}
