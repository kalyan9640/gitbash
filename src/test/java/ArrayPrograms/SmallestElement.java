package ArrayPrograms;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public class SmallestElement {

	@Test
	public void m1() {
		int[] a={1,2,3,4,5,188,6,7,8};
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}
	
	@Test
	public void m2() {
		int[] a={-500,1,2,3,4,5,188,6,7,8};
		ArrayList<Integer>al=new ArrayList<Integer>();
		for (int i : a) {
			al.add(i);
		}
		Collections.sort(al);
		System.out.println(al.get(0));
	}
}
