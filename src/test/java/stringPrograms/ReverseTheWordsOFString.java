package stringPrograms;

import org.testng.annotations.Test;

public class ReverseTheWordsOFString {

	@Test
	public void m1() {
		String s1 = "my name is pavan kalyan";
		String[] s2 = s1.split(" ");

		for (int i = s2.length - 1; i >= 0; i--) {
			System.out.print(s2[i] + " ");
		}
	}
}