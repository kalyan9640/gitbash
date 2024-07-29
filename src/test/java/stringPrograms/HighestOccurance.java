package stringPrograms;

import java.util.ArrayList;
import java.util.Collections;
import org.testng.annotations.Test;

public class HighestOccurance {
	@Test
	public void m1() {
		ArrayList<Character> al = new ArrayList<Character>();

		String s1 = "pavbaa";
		int highestOcc = 1;
		char highestChar = ' ';

		for (int i = 0; i < s1.length(); i++) {
			al.add(s1.charAt(i));
		}
		for (int i = 0; i < al.size(); i++) {
			int n = Collections.frequency(al, al.get(i));
					
			if (n > highestOcc&&n!=1) {
				highestOcc = n;
				highestChar = al.get(i);
			}

		}
		
		System.out.println(highestOcc == 1?"All are occuring one time":highestChar + "\t" + highestOcc);

		
		
		
		//		if (highestOcc == 1) {
//			System.out.println("All are occuring one time");
//		} else {
//			System.out.println(highestChar + "\t" + highestOcc);
//		}

	}
}
