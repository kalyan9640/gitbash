package javaPrigrams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class compare {
	
	String name;
	int height;
	int builtYear;
	

	public compare(String name, int height, int builtYear) {
		super();
		this.name = name;
		this.height = height;
		this.builtYear = builtYear;
	}

public static void main(String[] args) {
	
	List<compare> al = Arrays.asList(new compare("A", 100, 2000),
			new compare("B", 80, 2001),
			new compare("C", 120, 1998),
			new compare("D", 150, 2000));
	
	
	
	
	
	}
}
