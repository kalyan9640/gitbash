package stringPrograms;

import java.util.Arrays;
import java.util.Iterator;

import org.testng.annotations.Test;

public class pract {

	@Test
	public void m1() {

		String s = "abcdefg";
		char ch = 'a';

		String[] s1 = s.split(ch + "");

		for (int i = 0; i < s.length(); i++) {
			
			String sx = s.charAt(i) + "";
			
			if (!Arrays.toString(s1).contains(sx)) {
				
				System.out.println(s.charAt(i));
				
			}
		}

	}
}
