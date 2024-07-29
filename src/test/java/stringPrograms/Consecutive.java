package stringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Consecutive {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(10,11,13,18,1,2);
		
		ArrayList<Integer> m=new ArrayList<Integer>();
		
		ArrayList<Integer> temp=new ArrayList<Integer>();
		temp.add(a.get(0));
		for (int i = 1; i < a.size(); i++) {
			if (a.get(i)==a.get(i-1)+1) {
				temp.add(a.get(i));
			}
			else {
				if(temp.size()>m.size()) {
					m=new ArrayList<Integer>(temp);
				}
				temp.clear();
				temp.add(a.get(i));
			}
		}
		System.out.println(m);
	}
}
