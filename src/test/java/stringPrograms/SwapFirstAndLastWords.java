package stringPrograms;

import org.testng.annotations.Test;

public class SwapFirstAndLastWords {

	@Test
	public void m1() {
		String s1 = "my name is kalyan";
		String[] s2 = s1.split(" ");

		String temp = s2[s2.length - 1];
		s2[s2.length - 1] = s2[0];
		s2[0] = temp;
		for (String s : s2) {
			System.out.print(s + " ");
		}
	}

	@Test
	public void swapTwoStringsWithoutUsingVariable() {

		String s1 = "pavan";
		String s2 = "kalyan";
		s1 = s1 + s2;    //s1="pavankalyan"
		System.out.println(s1);
		s2 = s1.substring(0, s1.length() - s2.length()); //s2="pavan"
		s1 = s1.substring(s2.length());  //s1="kalyan"
		System.out.println(s1);
		System.out.println(s2);
	}
	
}
