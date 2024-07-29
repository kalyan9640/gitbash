package stringPrograms;

import org.testng.annotations.Test;

public class LexographicallyStrings {

	@Test
	public void m1() {
		String s1 = "pakan";
		String s2 = "Pauyan";
		int x = s1.compareTo(s2);
		if (x < 0) {
			System.out.println("lexicographically smaller");
		} else if (x > 0) {
			System.out.println("lexicographically greater");
		} else {
			System.out.println("lexicographically equal");

		}
	}

	@Test
	public void m12() {
		String s1 = "pavanz";
		String s2 = "pavan";
		int x = s1.compareTo(s2);
		System.out.println(x);
	}

	@Test
	public void m3() {
		String s1 = "pavana";
		String s2 = "pavan";
		int l = 0;
		try {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					l = s1.charAt(i) - s2.charAt(i);
					break;
				}
			}
			if (l > 0) {
				System.out.println(s1 + " is lexiocographically larger than " + s2);
			} else if (l < 0) {
				System.out.println(s1 + " is lexiocographically smaller than " + s2);
			} else {
				System.out.println(s1 + " is lexiocographically equal to " + s2);
			}
		} catch (Exception e) {

			if (s1.length() > s2.length()) {
				System.out.println(s1 + " is lexiocographically larger than " + s2);
			} else {
				System.out.println(s1 + " is lexiocographically smaller than " + s2);

			}
		}
	}
}
