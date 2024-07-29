package stringPrograms;

import org.testng.annotations.Test;

public class CountSpaces {

	@Test
	public void m1() {
		String s1 = " pa van kalyan ";
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
