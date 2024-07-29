package stringPrograms;

import org.testng.annotations.Test;

public class StringREverseAndPrint {
	
	@Test
	public void m1() {
		String s="hello";
        String rev=new StringBuilder(s).reverse().toString();
        int n=rev.length();
       for(int i=0;i<rev.length();i++){
           rev.substring(0,n);
           n--;
           System.out.println();
       }
       
	}
}
