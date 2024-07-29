package stringPrograms;

public class p {

	public static void main(String[] args) {
		
		String s="i am an Indian";
		String s1 = s.replace(" " , "");
		System.out.println(s);
		int index=s1.length()-1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==' ') {
				System.out.print(' ');
			}
			else {
				System.out.print(s1.charAt(index--));
			}
		}
	}
}
