package ArrayPrograms;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public class LargestElementInArray {

	@Test
	public void m1() {
		int[] a={1,2,3,4,5,188,6,7,8};
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
	
	@Test
	public void m2() {
		int[] a={1,2,3,4,5,188,6,7,8};
		ArrayList<Integer>al=new ArrayList<Integer>();
		for (int i : a) {
			al.add(i);
		}
		Collections.sort(al);
		System.out.println(al.get(al.size()-1));
	}
}
