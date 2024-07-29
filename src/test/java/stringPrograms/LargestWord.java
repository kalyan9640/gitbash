package stringPrograms;

import org.testng.annotations.Test;

public class LargestWord {

	@Test
	public void m1() {
		String s1="my name is pavan kalyan";
		String[] s2 = s1.split(" ");
		String lar="";
		int len=s2[0].length();
		for (int i = 0; i < s2.length; i++) {
			if (s2[i].length()>len) {
				len=s2[i].length();
				lar=s2[i];
			}
		}
		System.out.println(lar);
	}
}
