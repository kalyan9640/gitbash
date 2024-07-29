package javaPrigrams;

public class Missing1TO100 {

	public static void main(String[] args) {

		
		int []a = {2,8,9,45,78,1,12,15,17,6};
		for (int i = 1; i <=100; i++) {
			boolean b=true;
			for (int j : a) {
				if (i==j) {
					b=false;
					break;
				}
			}
			if (b) {
				System.out.println(i);
			}
		}
	}
}
