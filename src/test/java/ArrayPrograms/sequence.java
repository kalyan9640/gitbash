package ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class sequence {

	@Test
	public void m1() {
		List<Integer> l = new ArrayList<Integer>();
		int a[] = { 25, 10, 6, 7, 8, 9, 2, 3, 4, 5,7, 15, 16, 17, 18, 19, 20, 21, 22 };
		
		String highest="";
		String temp="";
		
		for (int i = 1; i < a.length-1; i++) {
			if (a[i-1]+1==a[i]) {
				temp=temp+a[i];
				System.out.println(temp);
			}
			else {
				if (temp.length()>=highest.length()) {
					highest=temp;
					temp="";
				}
			
			}
		}
		System.out.println(highest);
	}
}
