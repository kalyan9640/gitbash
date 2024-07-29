package seleniumPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class practice {

	@Test
	public void m1() {
		
		HashMap<String, Integer>hm=new HashMap<String, Integer>();
		hm.put("pavan", 10);
		hm.put("kalyan", 15);
		hm.put("pk", 8);
		hm.put("abc", 10);
		
		ArrayList<Entry<String, Integer>> al = new ArrayList<Entry<String,Integer>>(hm.entrySet());
		
		al.sort(Map.Entry.comparingByValue());
		
		System.out.println(al);
		
		}
}
