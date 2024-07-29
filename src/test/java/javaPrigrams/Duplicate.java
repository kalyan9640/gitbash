package javaPrigrams;
import java.util.Arrays;

public class Duplicate {
public static void main(String[] args) {
	int   a[] = {1,2,3,4,1,2,4,3,3,4,1};
	for (int i = 0, c=1;i < a.length;i++,c=0,c=1) 
	{
		//   OR int c=0,c=1;
		char ch='A';
		for (int j = i+1; j < a.length; j++) 
		{
			if(a[i]==a[j])
			{
				c++;
//				a[j]=Integer.MIN_VALUE+j;
				a[j]=ch++;
				
			}
		}
		if(c>1) 
		{
			System.out.println(a[i]);
		//a[i]=Integer.MIN_VALUE+i;
		}
		
	}
//	System.out.println(Arrays.toString(a));
	System.out.println(Integer.MIN_VALUE);
}
}