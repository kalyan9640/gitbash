package stringPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class OddIndex {
	@Test
	public void oddIndex()
	{
		String s1="I am from Banglore";
		String s2[]=s1.split(" ");
		String s3[]=new String[s2.length];
		for (int i = 0; i < s2.length; i++) {
			if(i%2==1)
			{
				s3[i]=s2[i];
			}
		}
		for (int i = s3.length-1; i>0; i--) {
			
		}
	}

}
