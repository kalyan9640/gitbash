package ArrayPrograms;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[]a= {10,20,30,10,40,50};
		
		for (int i = 0; i < a.length; i++) {
			boolean b=true;
			for (int j = 0; j < i; j++) {
				if (a[i]==a[j]) {
					b=false;
				}
			}
			if (b) {
				System.out.println(a[i]);
			}
		}
	}
	@Test
	public void m1() {
		int[]a= {10,20,30,10,40,50};
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		for (Integer i : a) {
			lh.add(i);
		}
		System.out.println(lh);
	}
	
}
