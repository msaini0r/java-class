package recursion;

// when you write the fibonnaci number in a formula it is known as recurrence relation.
//the base condition is represented by the answers we already have.
public class FibonnaciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(7));

	}
	static int fibo(int n) {
//		base condition
		if(n<2) {
			return n;
		}
		
//		the below step is not tail recursion because there is addition and subraction.
//		
		return fibo(n-1) + fibo(n-2);
	}

}
