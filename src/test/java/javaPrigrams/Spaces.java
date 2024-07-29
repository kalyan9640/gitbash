package javaPrigrams;

import java.util.Iterator;

public class Spaces {

	public static void main(String[] args) {
		m1();
//		String s1="my name is xyz";
//		//        "zy xsie ma nym"
//		String rev="";
//		int len=s1.length()-1;
//		
//		for (int i = 0; i < s1.length(); i++) {
//			if (s1.charAt(i)==' ') {
//				rev=rev+' ';
//			}
//			else {
//				if (s1.charAt(len)==' ') {
//					len--;
//					rev=rev+s1.charAt(len);
//					len--;
//					
//				}
//				else {
//					rev=rev+s1.charAt(len);
//					len--;
//				}
//				
//			}
//		}
//		System.out.println(rev);
	}
	
	public static void m1() {
		String s1="my name is kalpana";
		String s2="";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i)!=' ') {
				s2=s1.charAt(i)+s2;
			}
		}
		String s3="";
		int j=0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i)==' ') {
				s3=s3+" ";
			}
			else {
				s3=s3+s2.charAt(j++);
			}
		}
		System.out.println(s3);
		
		
	}
	
}
