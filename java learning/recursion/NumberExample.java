package recursion;

public class NumberExample {

	public static void main(String[] args) {
		
		//write a function that takes in number and prints it.
		//print first five numbers 1,2,3,4,5.
		
	
		
//when a function is not finished executing it will be saved in stack memory.
//once the function is finished executing it will be removed from stack memory & it will move back from where it was called.here it is print1(1).
		print1(1);
	}
	static void print1(int n) {
		System.out.println(n);
		print2(2);
	}
	
	static void print2(int n) {
		System.out.println(n);
		print3(3);
	}
	
	static void print3(int n) {
		System.out.println(n);
		print4(4);
	}
	
	static void print4(int n) {
		System.out.println(n);
		print5(5);
	}

	static void print5(int n) {
		System.out.println(n);

}
}
