package ArrayPrograms;

import org.testng.annotations.Test;

public class Print1to100WithouLoops {

	@Test
	public void m1() {

	}
	@Test
	public void m2(int n) {
		if (n <= 100) {
//            System.out.println(n); 
           m2(++n);

		}	
	}
}
