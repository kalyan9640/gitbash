package ArrayPrograms;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class FrequencyOfOccurance {

	@Test
	public  void main() {
		int[]a= {10,20,30,10,40,50,30};
		
		int visit=-1;
		int []b=new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			int count=1;
			for (int j = i+1; j < a.length; j++) {
			
				if (a[i]==a[j]) {
					b[j]=visit;
					count++;
				}
			}
			if (b[i]!=visit) {
				System.out.println(a[i]+"present "+count+" times");
			}
		}
	}
	@Test
	public void m1() {
		int[]a= {10,20,30,10,40,50,50};
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		for (Integer i : a) {
			lh.add(i);
		}
		for (Integer i : lh) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if (i==a[j]) {
					count++;
				}
			}
				System.out.println(i+"present "+count+" times");
		}
	}
	@Test
	public void printOccurenceOfElementInArray() {
		int[] arr = { 10, 20, 10, 40, 20 };

		for (int i = 0; i < arr.length ; i++) {
			int count = 1;

			for (int j = i+1; j < arr.length; j++) {

				if (arr[i] == arr[j] && i > j) {
					break;

				} else if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count >1) {
				System.out.println(arr[i] + " " + count+" TIMES");
			}
		}
	}
	
}
