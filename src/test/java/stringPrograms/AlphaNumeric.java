package stringPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class AlphaNumeric {

	@Test
	public void m1() {
		String s1 = "a4b2c3d10";
		String s2 = "";
		for (int i = 0; i < s1.length() - 1; i++) {
			if ((s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') || (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
					&& (s1.charAt(i + 1) >= '0' && s1.charAt(i + 1) <= '9')) {
				int a = s1.charAt(i + 1) - '0';
				while (a > 0) {
					s2 = s2 + s1.charAt(i);
					a--;
				}
			}
		}
		System.out.println(s2);
	}

	@Test
	public void m11() {
		String s1 = "aaa1b2c3";
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			if ((s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') || (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')) {
				System.out.print(s1.charAt(i) + "".repeat((int) s1.charAt(i + 1) - '0'));
			}
		}
		System.out.println(s2);
	}

	@Test
	public void m2() {
		String s1 = "a123b456c789";
		String s2 = "";
		String s3 = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
				s2 = s2 + s1.charAt(i);
			} else {
				s3 = s3 + s1.charAt(i);
			}
		}
		System.out.println(s3 + s2);
	}

	@Test
	public void m3() {
		String s1 = "a2b2c4";
		String s2 = "";
		int sum = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
				sum = sum + (s1.charAt(i) - '0');
			} else {
				s2 = s2 + s1.charAt(i);
			}
		}
		System.out.println(s2 + sum);
	}

	@Test
	public void m4() {
		String s1 = "@12$13";

		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) >= '0' && s2.charAt(i) <= '9') {
//				s2=s2+
			}
		}

	}

	@Test
	public void m5() {
		String s1 = "Hello";

		for (int i = 0; i < s1.length(); i++) {

			System.out.print(s1.charAt(i) + " ".repeat(i + 1));

		}
	}

	@Test
	public void m6() {
		String s1 = " ";

		for (int i = 0; i < s1.length(); i++) {
			System.out.print(s1.charAt(i) + (" ".repeat(i + 1)));

		}
	}

	@Test
	public void m7() {
		String s1 = "      KA    ,    TS     ";
		String[] s2 = s1.split(",");
		String s3 = "";
		for (int i = 0; i < s2.length; i++) {
			s3 = s2[i].trim() + " " + s3;
		}
		System.out.println(s3);
	}

	@Test
	public void m10() {
		String s1 = "aa2b2c3d4";
		String s2 = "";
		for (int i = 0; i < s1.length() - 1; i++) {
			if ((s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') || (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
					&& (s1.charAt(i + 1) >= '0' && s1.charAt(i + 1) <= '9')) {
				int a = s1.charAt(i + 1) - '0';

			}
		}
		System.out.println(s2);
	}

	@Test
	public void m21() {
		String s1 = "a123b456";
		// abc789456123
		String s2 = "";
		String s3 = "";
		String s4 = "";

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
				s2 = s2 + s1.charAt(i);
				s4 = s3 + " " + s4;
				s3 = "";

			} else {
				s3 = s3 + s1.charAt(i);
			}
		}
		System.out.println(s2 + " " + s3 + " " + s4);
	}

	@Test
	public void m22() {

		String s1 = "a123b456c789";
		
		String s2 = s1.replaceAll("[0-9]", "");
		
		String[] s3 = s1.split("[a-z]");
		String result="";	
		for (int i = 0; i < s3.length; i++) {
			result=s3[i]+" "+result;
		}
		System.out.println(s2+" "+result);
	}
	@Test
	public void m23() {
	
		String s1 = "$12%*&0bs";
		
		System.out.println(s1.replaceAll("[0-9]", "").replaceAll("[a-z]", ""));
		
		
	}
}
