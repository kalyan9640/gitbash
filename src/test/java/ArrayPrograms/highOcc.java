package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class highOcc {

	@Test
	public void m1() {
		int []a={25,15,6,7,8,9,2,3,10};

		String h="";

		String t="";
		
		for (int i = 1; i < a.length; i++) {

			if (a[i-1]+1==a[i]) {
				t=t+a[i];
				
			} else {
				if (t.length()>h.length()) {
					h=t;
					t=a[i]+"";
				}

			}

		}
		System.out.println(h);

	}
}
