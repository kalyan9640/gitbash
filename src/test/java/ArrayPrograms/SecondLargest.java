package ArrayPrograms;

import java.util.ArrayList;
import java.util.Collections;
import org.testng.annotations.Test;

public class SecondLargest {

	@Test
	public void m1() {
		int[] a={1,2,3,4,5,188,6,7,8,100};
		int max=a[0];
		int smax=a[1];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				smax=max;
				max=a[i];
			}
			else if (a[i]>smax&&a[i]<max) {
				smax=a[i];
			}
		}
		System.out.println(smax);
	}
	@Test
	public void m2() {
		int[] a={1,2,3,4,5,188,6,7,8,100};
		ArrayList<Integer>al=new ArrayList<Integer>();
		for (int i : a) {
			al.add(i);
		}
		Collections.sort(al);
		System.out.println(al.get(al.size()-2));
	
	}
}
