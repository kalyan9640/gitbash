package javaPrigrams;

import org.testng.annotations.Test;

public class ImmutablePractice {

	@Test
	public void m1() {
		
		Integer i=10;
		System.out.println(i.hashCode());
		
		i=35;
		System.out.println(i.hashCode());
		
		i=10;
		System.out.println(i.hashCode());
	}
	@Test
	public void m2() {
	
		String s="pavan";
		System.out.println(s.hashCode());
		
		s="kalyan";
		System.out.println(s.hashCode());
		
		s="pavan";
		System.out.println(s.hashCode());
		
	}
}
