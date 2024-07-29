package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class RightShiftInArrayNtimes {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		int n = 3;
		while (n > 0) {
			for (int i = a.length - 1; i > 0; i--) {

				int temp = a[i - 1];
				a[i - 1] = a[i];
				a[i] = temp;
			}
			n--;
		}
		System.out.println(Arrays.toString(a));
	
	}
	@Test
	public void m2() {
		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = { 10, 20, 30, 40, 50 };
		int n = 3;
		List<Integer> l=new ArrayList<Integer>();
		Arrays.stream(a).forEach(m -> l.add(m) );
		System.out.println(l);
		Collections.rotate(l, n);
		System.out.println(l);	
		int x = Arrays.binarySearch(a, 50);
		System.out.println(x);
		Arrays.compare(a, b);
	}
}
