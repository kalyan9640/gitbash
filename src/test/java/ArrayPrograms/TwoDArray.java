package ArrayPrograms;

import org.testng.annotations.Test;

public class TwoDArray {

	@Test
	public void m1() {
		
		int [][]a= {{10,20,30},{11,22,33}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		
	}
}
