package javaPrigrams;

public class Arr {
public static void main(String[] args) {
	int a[]= {1,1,2,2,3,3,4,4,5,5};
	for (int i = 0; i < a.length; i++) {
		boolean b=false;
		for (int j = 0; j < a.length; j++) {
			if (i!=a[j]) {
				b=true;
			}
			
		}
		if (b) {
			System.out.println(i);
		}
	}
	
	
	
	
}
}
