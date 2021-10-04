package recursion;

public class Factorial {
    public static void main(String[] args) {
        int ans = Factorial(5);
System.out.println(ans);
    }
    static int Factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*Factorial(n-1);
    }
}

/*
// Similarly, we can do it for sum also

public static void main(String[] args) {
        int ans = Factorial(5);
System.out.println(ans);
    }
    static int sum(int n){
        if(n<=1){
            return 1;
        }
        return n + Factorial(n-1);
    }
}
 */
