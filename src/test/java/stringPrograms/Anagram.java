package stringPrograms;

import java.util.Iterator;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Anagram {

	@Test
	public void m1() {
		String s1 = "pavan";
		String s2 = "navap";
		if (s1.length() == s2.length()) {

			TreeSet<Character> t1 = new TreeSet<Character>();
			TreeSet<Character> t2 = new TreeSet<Character>();
			for (int i = 0; i < s1.length(); i++) {
				t1.add(s1.charAt(i));
				t2.add(s2.charAt(i));
			}
			Iterator<Character> i = t1.iterator();
			Iterator<Character> i1 = t2.iterator();
			boolean b = true;
			while (i.hasNext()) {
				if (i.next() != i1.next()) {
					b = false;
					break;
				}
			}
			if (b) {
				System.out.println("given strings is anagrom");
			} else {
				System.out.println("given strings are not anagrom");
			}
		} else {
			System.out.println("Not anagrom");
		}
	}

	@Test
	public void main() {
		String s1 = "silent";
		String s2 = "listen";
		
		if (s1.length() == s2.length()) {
			char c1[] = s1.toCharArray();
			char c2[] = s2.toCharArray();
			sortArray(c1);
			sortArray(c2);
			boolean b = true;
			for (int i = 0; i < c1.length; i++) {
				if (c1[i] != c2[i]) {
					b = false;
					break;
				}
			}
			if (b) {
				System.out.println("given strings are anagram");
			} else {
				System.out.println("given strings are not anagram");
			}
		} else {
			System.out.println("given strings are not anagram");
		}
	}

	public void sortArray(char c1[]) {
		for (int i = 0; i < c1.length - 1; i++) {
			for (int j = 0; j < c1.length - 1; j++) {
				if (c1[j] > c1[j + 1]) {
					char temp = c1[j];
					c1[j] = c1[j + 1];
					c1[j + 1] = temp;
				}
			}
		}
	}

}
