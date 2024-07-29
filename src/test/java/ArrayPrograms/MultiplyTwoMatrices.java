package ArrayPrograms;

import static org.mockito.ArgumentMatchers.anyBoolean;

import org.testng.annotations.Test;

public class MultiplyTwoMatrices {

	@Test
	public void m1() {
		int[][] a = { { 1, 1 } };
		int[][] b = { { 1 }, { 2 } };
		int c[][] = new int[a.length][b[0].length];
		if (a[0].length == b.length) {
			
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					for (int k = 0; k < b.length; k++) {
						c[i][j] = c[i][j] + a[i][k] * b[k][j];
					}
					System.out.print(c[i][j] + "\t");
				}
				System.out.println();
			}
		}else {
			System.out.println("multiplication is not possible");
		}
	}
}
