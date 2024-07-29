package stringPrograms;

import org.testng.annotations.Test;

public class RemoveDuplicates {

	@Test
	public void m1() {
		String s1="pavan kalyan";
		String s2="";
		for (int i = 0; i < s1.length(); i++) {
			if (s2.indexOf(s1.charAt(i))==-1){
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
	}
}
