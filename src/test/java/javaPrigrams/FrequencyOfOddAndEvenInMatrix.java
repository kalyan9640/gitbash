package javaPrigrams;

import org.testng.annotations.Test;

public class FrequencyOfOddAndEvenInMatrix {

	@Test
	public void m1() {
		int[][] a = { { 1, 2, 2 }, { 4, 8, 6 } };

		int eFreq = 0;
		int oFreq = 0;

		for (int[] r : a) {
			for (int n : r) {
				if (n % 2 == 0) {
					eFreq++;
				} else {
					oFreq++;
				}
			}
		}
		System.out.println(eFreq+"\t"+oFreq);
	}
}
