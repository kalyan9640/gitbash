package stringPrograms;

import org.testng.annotations.Test;

public class UpperCase {

	@Test
	public void m1() {
		String s1="paVaN kalyan";
		System.out.println(s1.toUpperCase());
		
	}
	@Test
	public void m2() {
		String s1="PaVaN kaLyan";
		String s2="";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i)>='a'&&s1.charAt(i)<='z') {
				s2=s2+(char)(s1.charAt(i)-32);
			}
			else {
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
	}
	
}
