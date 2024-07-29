package stringPrograms;

import org.testng.annotations.Test;

public class CountTheWords {

	@Test
	public  void main() {
		
		String s="  failed to load page ";
		int count=1;
		for (int i = 0; i < s.length()-1; i++) {
			
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
				count++;
			}	
		}
		System.out.println(count);
	}
	@Test
	public void m2() {
		String s="     sujoy          failed     to        load       page          ";
		String st[] = s.split(" ");
		int count=0;
		for (String s1 : st) {
			if (s1!="") {
				count++;
			}
		}
		System.out.println(count);
	}
}
