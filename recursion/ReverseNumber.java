package recursion;

public class ReverseNumber {
    //this is cheating because we are using extra function sum,but we are not doing it with pure recursion method.
    //so use method 2.
//    static int sum = 0; //(this sum is basically a part of scoping)
//    static void rev1(int n) {
//            if(n == 0) {
//            return;
//        }
//        int rem = n % 10;
//        sum = sum * 10 + rem;
//        rev1(n / 10);
//    }
//// sometimes you might need some additional variables in the argument in that case make another function.
//    public static void main(String[] args) {
//        rev1(1234);
//        System.out.println(sum);
//    }
//}

static int rev2(int n) {
    int digits = (int)(Math.log10(n)) + 1;
    return helper(n, digits);
}
private static int helper(int n,int digits){
    if(n%10==n){
        return n;
    }
int rem = n%10;
    return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
}

    public static void main(String[] args) {
        System.out.println(rev2(1234));
    }
}
