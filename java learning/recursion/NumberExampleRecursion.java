package recursion;

// RECURSION BASICALLY MEANS FUNCTION CALLING ITSELF.

// It help us in solving bigger/complex problems in a simple way.
// you can convert recursion solution into iteration( basically means not using function call and using loops instead to get a more optimised answer) & vice-versa.
// Space complexity is not constant because of recursion calls.

public class NumberExampleRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print(1);

	}
//  this below check is applied because we want the value till 5, otherwise the values will go on.
//	this check is also known as base condition in recursion .
	
	static void print(int n) {
		if (n==10) { 
			System.out.println(10);
			return;
//	every call of function will take some stack memory it doesn't matter if you call the same function every-time.
//	if the base condition is not there then function calling will keep happening and stack memory will exceed the limit at one point.(known as stack over flow).
			
		}
		System.out.println(n);
		
//		the below step is called tail recursion .
//		this is the last function call.
		print(n+1);
	
	}
}
