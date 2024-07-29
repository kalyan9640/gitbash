package ArrayPrograms;

import java.util.ArrayList;
import java.util.Collections;
import org.testng.annotations.Test;

public class SecondSmallest {

	@Test
	public void m1() {
		int[] a={1,2,3,4,5,188,6,7,8,100};
		int min=a[0];
		int smin=a[1];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				smin=min;
				min=a[i];
			}
			else if (a[i]<smin&&a[i]>min) {
				smin=a[i];
			}
		}
		System.out.println(smin);
	}
	@Test
	public void m2() {
		int[] a={1,2,3,4,5,188,6,7,8,100};
		ArrayList<Integer>al=new ArrayList<Integer>();
		for (int i : a) {
			al.add(i);
		}
		Collections.sort(al);
		System.out.println(al.get(1));
	
	}
}
