package stringPrograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class GivenWordIsPresentOrNot {

	@Test
	public void m1() {
		String s1 = "hii hii hello kalyan";
		String s2 = "hello";
		System.out.println(s1.contains(s2) ? "is present" : "not present");
	}

	@Test
	public void m2() {
		String s1 = "hii hii hello kalyan";
		String key = "hello";
		String[] s2 = s1.split(" ");
		boolean b = false;
		for (int i = 0; i < s2.length; i++) {
			if (key.equals(s2[i])) {
				b = true;
				break;
			}
		}
		if (b) {
			System.out.println("is present");
		} else {
			System.out.println("is not present");
		}
	}

	@Test
	public void m3() {
		String s1 = "hii hii hello kalyan hii";
		String key="kalyan";
		String[] s2 = s1.split(" ");

		Set<String> lh=new LinkedHashSet<String>();
		System.out.println(lh);
		for (int i = 0; i < s2.length; i++) {
			lh.add(s2[i]);
		}
		System.out.println(lh.contains(key)?"is present":"not present");
	}
}
