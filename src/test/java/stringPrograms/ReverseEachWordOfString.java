package stringPrograms;

import org.testng.annotations.Test;

public class ReverseEachWordOfString {

	@Test
	public void m1() {
		String s1 = "my name is pavan kalyan";
		String[] s2 = s1.split(" ");
		String result="";
		for (int i = 0; i < s2.length; i++) {
			String rev="";
			for (int j = s2[i].length()-1; j >=0 ; j--) {
				rev=rev+s2[i].charAt(j);
			}
			result=result+rev+" ";
		}
		System.out.println(result);
	}
}