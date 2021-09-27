package recursion;

// when you write the fibonnaci number in a formula it is known as recurrence relation.
//the base condition is represented by the answers we already have.
public class FibonnaciNumbers {

/// if you will take number like 50 it will not show any number because the recursion tree is evaluating the same thing again & again.

	public static void main(String[] args) {
//     for (int i = 0; i < 11; i++) {
//          System.out.println(fiboFormula(i));
//      }

      System.out.println(fiboFormula(50));
  }

  static int fiboFormula(int n) {
      // just for demo, use long instead
      return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
  }

  static int fibo(int n) {
      // base condition
      if (n < 2) {
          return n;
      }
      
//      the below step is not tail recursion because there is addition and subraction.
      return fibo(n-1) + fibo(n-2);
  }
}
	
