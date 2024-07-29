package ArrayPrograms;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class MaximumFrequencyElement {
	@Test
	public void m1() {
		int a[] = {5,1,1,1,2,2,3,3,3,3,2};
		int freq = 1;
		int highestFreq=a[0];
		for (int i = 0; i < a.length; i++) {
			int count=1;
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					count++;
					if (count>freq) {
						freq=count;
						highestFreq=a[i];
					}
				}
			}
		}
		System.out.println(highestFreq);
	}
	@Test
	public void m2() {
		int a[] = {5,1,1,1,2,2,3,3,3,3,2,2,2,3,3};
		int highestFreq=a[0];
		int freq=0;
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		for (Integer i : a) {
			lh.add(i);
		}
		for (Integer b : lh) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if (b==a[i]) {
					count++;
				}
			}
			if (count>freq) {
				freq=count;
				highestFreq=b;
			}
		}
		System.out.println(highestFreq);
		
	}
	
	
	@Test
	public void m3() {
		int a[] = {1,2,1,2};
		int freq = 1;
		int highestFreq=a[0];
		for (int i = 0; i < a.length; i++) {
			int count=1;
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					count++;
				}
			}
			if (count>freq) {
				freq=count;
				highestFreq=a[i];
			}
		}
		System.out.println(highestFreq);
	}
}
