package ArrayPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class LeftShiftInArray {

	public static void main(String[] args) {
		int[]a= {10,20,30,40,50};
		for (int i = 1; i < a.length; i++) {
				int temp=a[i-1];
				a[i-1]=a[i];
				a[i]=temp;		
		}
		System.out.println(Arrays.toString(a));
		
	}
	@Test
	public static void m1() {
		int[]a= {10,20,30,40,50};
		for (int i = 0; i < a.length-1; i++) {
				int temp=a[i+1];
				a[i+1]=a[i];
				a[i]=temp;		
		}
		System.out.println(Arrays.toString(a));
	}
}
