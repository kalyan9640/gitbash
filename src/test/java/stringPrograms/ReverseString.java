package stringPrograms;

import org.testng.annotations.Test;

public class ReverseString {

	@Test
	public void m1() {
		String s1="pavan kalyan";
		
		for (int i = s1.length()-1; i>=0 ; i--) {
		System.out.print(s1.charAt(i));
		}
	}
	@Test
	public void m2() {
	System.out.println(new StringBuilder("pavan kalyan").reverse());
	System.out.println(new StringBuffer("pavan kalyan").reverse());

	}
}
