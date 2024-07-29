package stringPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class LargestPalindromeString {

	@Test
	public void m1() {

		String s1 = "malayalam and madam are palindromes repaper";
		String[] s = s1.split(" ");
		System.out.println(s.length);
		for (String y : s) {
			System.out.println(y);
		}
		System.out.println(Arrays.toString(s));
		String lpalin = "";
		int len = 0;
		for (String s2 : s) {
			String s3 = new StringBuilder(s2).reverse().toString();
			if (s2.equals(s3) && s2.length() > len) {
				len = s2.length();
				lpalin = s2;
			}
		}
		System.out.println(lpalin);
	}

	@Test
	public void m2() {
		String s1 = "malayalam and madam are palindromes Repaper";
		String s2 = new StringBuilder(s1).reverse().toString();
		System.out.println(s2);

		String[] s = s2.split(" ");
		String lp = "";
		for (String w : s) {
			if (s1.contains(w) && w.length() > lp.length()) {
				lp = w;
			}
		}
		System.out.println(lp);
	}

	@Test
	public void m3() {
		String s1 = "";
		
		StringBuilder s = new StringBuilder(s1);
		StringBuffer sb = new StringBuffer(s1);
		
		System.out.println(sb.capacity());
		
		s.insert(0, "false");
		
		s.delete(0, 5);
		
		int y = s.capacity();
		System.out.println(s);
		System.out.println(y);
	}
	
	@Test
	public void m4() {
		char []a= {'a','b','c'};
		char []b= {'A','B','C'};
		
		boolean x = Arrays.toString(a).equalsIgnoreCase(Arrays.toString(b));
		
		System.out.println(x);
	}
}