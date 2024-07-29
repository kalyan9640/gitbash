package stringPrograms;

import org.testng.annotations.Test;

public class FreqOfChar {

	@Test
	public void m1() {
		String s1 = "pavan";
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			if (!s2.contains(s1.charAt(i) + "")) {
				s2 = s2 + s1.charAt(i);
				int count = 1;
				for (int j = i + 1; j < s1.length() - 1; j++) {
					if (s1.charAt(i) == s1.charAt(j)) {
						count++;
					}
				}
				System.out.println(s1.charAt(i) + " present " + count + "  times");
			}
		}
	}
}
