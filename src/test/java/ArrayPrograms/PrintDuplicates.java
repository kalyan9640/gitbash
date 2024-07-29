package ArrayPrograms;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 10, 40, 50, 30 };
		int visit = -1;
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					b[j] = visit;
					count++;
				}
			}
			if (b[i] != visit && count > 1) {
				System.out.println(a[i]);
			}
		}
	}

	@Test
	public void m1() {
		int[] a = { 10, 20, 30, 10, 40, 50, 50 };
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		for (Integer i : a) {
			lh.add(i);
		}
		for (Integer i : lh) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(i);
			}
		}
	}

}
