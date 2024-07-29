package ArrayPrograms;

import java.util.Arrays;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class DescendingOrder {

	@Test
	public void m1() {
		int a[]= {1,5,9,2,4,6,7,3,8};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]<a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	@Test
	public void m2() {
		int a[]= {1,5,9,2,4,6,7,3,8};
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for (int i : a) {
			ts.add(i);
		}
		ts=(TreeSet<Integer>) ts.descendingSet();
		System.out.println(ts);
	}
}
