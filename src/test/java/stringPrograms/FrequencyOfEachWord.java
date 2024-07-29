package stringPrograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import org.testng.annotations.Test;

public class FrequencyOfEachWord {

	@Test
	public void m1() {
		String s1 = "hii kalyan hii hello kalyan";
		String[] s2 = s1.split(" ");
		System.out.println(Arrays.toString(s2));
		int count = 1;
		for (int i = 0; i < s2.length; i++) {
			count = 1;
			for (int j = i + 1; j < s2.length; j++) {
				if (s2[i].equals(s2[j])) {
					s2[j] = "";
					count++;
				}
			}
			if (s2[i] != "") {

				System.out.println(s2[i] + " present " + count + " times");
			}
		}

	}

	@Test
	public void m2() {
		String s1 = "hii hii hello kalyan";
		String[] s2 = s1.split(" ");

		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		for (String s : s2) {
			lh.add(s);
		}
		for (String s : lh) {
			int count = 0;
			for (int i = 0; i < s2.length; i++) {
				if (s.equals(s2[i])) {
					count++;
				}
			}
			System.out.println(s + "  " + count);
		}
	}

	@Test
	public void m3() {
		String s1 = "hii hii hello kalyan hii";
		String[] s2 = s1.split(" ");

		Map<String, Integer> lh = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < s2.length; i++) {

			int count = 1;
			if (!lh.containsKey(s2[i])) {
				for (int j = i + 1; j < s2.length; j++) {
					if (s2[i].equals(s2[j])) {
						count++;
					}
				}
				lh.put(s2[i], count);
			}
		}
		System.out.println(lh);
	}
}
