package ArrayPrograms;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public class MaxElementInArray {

	@Test
	public void m1() {
		int a[] = { 10, 15, 8, 9, 15, 15, 15, 7, -5, -9 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (Integer i : a) {
			al.add(i);
		}
		System.out.println(Collections.max(al));
	}
}
