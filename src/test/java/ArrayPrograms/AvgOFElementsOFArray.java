package ArrayPrograms;

public class AvgOFElementsOFArray {

	public static void main(String[] args) {
		int[]a= {10,20,30,40,50};
		int sum=0;
		for (int i : a) {
			sum=sum+i;
		}
		System.out.println(sum/a.length);
	}
}
