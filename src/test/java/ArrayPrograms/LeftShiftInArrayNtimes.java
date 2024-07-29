package ArrayPrograms;

import java.util.Arrays;

public class LeftShiftInArrayNtimes {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		int n = 2;
		
		while (n > 0) {
			for (int i = 1; i < a.length; i++) {
					int temp = a[i - 1];
					a[i - 1] = a[i];
					a[i] = temp;
					
			}
			n--;
		}
		System.out.println(Arrays.toString(a));

	}
}
