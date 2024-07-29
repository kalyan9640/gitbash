package stringPrograms;

import org.testng.annotations.Test;

public class VowelsAndConsonants {

	@Test
	public void m1() {
		String s1="pavan kalyan";
		String v="AEIOUaeiou";

		for (int i = 0; i < s1.length(); i++) {
			if ((s1.charAt(i)>='A'&&s1.charAt(i)<='Z')||(s1.charAt(i)>='a'&&s1.charAt(i)<='z')) {
				
				if (v.indexOf(s1.charAt(i))!=-1) {
					System.out.println(s1.charAt(i)+" is an vowel");
				} else {
					System.out.println(s1.charAt(i)+" is a consonant");
				}
				
			}
			else {
				System.out.println(s1.charAt(i)+" is a special character ");
			}
			
		}
	}
}
