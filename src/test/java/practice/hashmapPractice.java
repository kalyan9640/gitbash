package practice;

import java.util.HashMap;

import org.testng.annotations.Test;

public class hashmapPractice {

	@Test
	public void m1() {
		String s1 = "pavaeaon kaulyano";
		String v = "aeiou";
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();

		for (int i = 0; i < v.length(); i++) {
			int count = 0;
			if (!hs.containsKey(v.charAt(i))) {
				for (int j = 0; j < s1.length(); j++) {
					if (v.charAt(i) == s1.charAt(j)) {
						count++;
						hs.put(v.charAt(i), count);
					}
				}
			}

		}
		System.out.println(hs);
	}
	@Test
	public void m2() {
		String s1 = "pavaeaonkaulyano";
		
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();

		for (int i = 0; i < s1.length(); i++) {
			
			hs.put(s1.charAt(i), null);
		}
		System.out.println(hs.keySet());
		
	}
}
