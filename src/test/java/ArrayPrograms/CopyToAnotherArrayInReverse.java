package ArrayPrograms;

import java.util.Arrays;

public class CopyToAnotherArrayInReverse {

	public static void main(String[] args) {
		int[]a= {10,20,30,40,50};
		int []b=new int[a.length];
		int index=0;
		for (int i = a.length-1; i >=0; i--) {
			b[index++]=a[i];
		}
		System.out.println(Arrays.toString(b));
		
	
	}
}
