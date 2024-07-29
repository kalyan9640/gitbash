package ArrayPrograms;

public class ElementIsPresentInArray {

	public static void main(String[] args) {
		int[]a= {10,20,30,40,50};
		int key=30;
		for (int i = 0; i < a.length; i++) {
			if (key==a[i]) {
				System.out.println("given number is present in array");
				break;
			}
		}
		
		
	}
}
