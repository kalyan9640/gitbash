package ArrayPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MoveAllZerosToEnd {

	@Test
	public void m1() {
		int a[] = { 1, 0, 0, 2, 0, 5, 0, 9, 0, 8, 55, 0 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i; j < a.length - 1 - i; j++) {
				if (a[j] == 0) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	@Test
	public void m2() {
		int a[] = { 1, 0, 0, 2, 0, 5, 0, 9, 0, 8, 55, 0 };
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == 0) {
				int temp = a[i + 1];
				a[i + 1] = a[i];
				a[i] = temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
