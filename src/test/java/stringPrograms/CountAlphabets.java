package stringPrograms;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class CountAlphabets {
	@Test
	public void countAlphabets() {
		String s1 = "ppavaapppaannnn";
		int count = 1;
		for (int i = 0; i < s1.length() - 1; i++) {
			if (s1.charAt(i) == s1.charAt(i + 1)) {
				count++;
			} else {
				System.out.print(s1.charAt(i) + "" + count);
				count = 1;
			}
		}
		System.out.println(s1.charAt(s1.length()-1)+""+count);
	}

}
