package string;

import java.util.Arrays;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Karan Sharma";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.toLowerCase());
		System.out.println(name);
		System.out.println(name.indexOf('a'));
		System.out.println("      karan     ".strip());
		System.out.println(Arrays.toString(name.split(" ")));

	}

}
