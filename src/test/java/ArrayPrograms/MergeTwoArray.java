package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

public class MergeTwoArray {

	@Test
	public  void main() {
		int[]a= {10,20,30,40,50};
		int[]b= {60,70,80,90,100};
		int c[]=new int[a.length+b.length];
		
		for (int i = 0; i < c.length; i++) {
			if (i<a.length) {
				c[i]=a[i];
			}
			else
				c[i]=b[i-a.length];
		}
		System.out.println(Arrays.toString(c));
	}
	
	@Test
	public void m1() {
		int[]a= {10,20,30,40,50};
		int[]b= {60,70,80,90,100};
		ArrayList<Integer> al=new ArrayList<Integer>();
		for (Integer c : a) {
			al.add(c);
		}
		for (Integer c : b) {
			al.add(c);
		}
		System.out.println(al);
	}
	@Test
	public  void m3() {
		int[]a= {10,20,30,40,50};
		int[]b= {60,70,80,90,100};
		int c[]=new int[a.length+b.length];
		
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println(Arrays.toString(c));

	}
}
