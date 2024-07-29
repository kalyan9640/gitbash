package ArrayPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SwapFirstHalfSecondHalf {

	@Test
	public void m1() {
	int a[]= {1,2,3,4,5,6,7};
	int h=a.length/2;
	
	for (int i = 0; i < a.length/2; i++) {
		int temp=a[h];
		a[h]=a[i];
		a[i]=temp;
		h++;
	}
	if (a.length%2!=0) {
		
	}
	System.out.println(Arrays.toString(a));
	}
	@Test
	public void swap1stHalf2ndHalf() {
		 int[] a = {1, 2, 3, 4, 5, 6,7};
		 int length = a.length;
		 
	        int mid = length / 2;

	        for (int i = 0; i < mid; i++) {
	            int temp = a[i];
	            a[i] = a[mid + i + (length % 2)];
	            
	            a[mid + i + (length % 2)] = temp;
	        }
	        System.out.println(Arrays.toString(a));
	}
}