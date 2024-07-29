package stringPrograms;

import org.testng.annotations.Test;

public class ReplaceVowelsWithSpace {

	@Test
	public void m1() {
		String s1="pavan kalyan";
		String v="AEIOUaeiou";
		String s2="";
		for (int i = 0; i < s1.length(); i++) {
			if (v.contains(s1.charAt(i)+"")) {
				s2=s2+' ';
			}
			else {
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
	}
	@Test
	public void m2() {
		String s1="pavan kalyan";
		String v="AEIOUaeiou";
		for (int i = 0; i < s1.length(); i++) {
			if (v.contains(s1.charAt(i)+"")) {
			s1=s1.replace(s1.charAt(i), ' ');	
			}
		}
		System.out.println(s1);
	}
}
