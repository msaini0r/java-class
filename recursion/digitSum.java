package recursion;

public class digitSum {
    public static void main(String[] args) {
        int ans = sum(1342);
        System.out.println(ans);
    }
    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sum(n / 10);
    }
}
/*
    Similarly, we can do it for product but we have to do a slight change.
     static int sum(int n) {
        if (n%10 == n) {
            return n;
        }
        return (n % 10) * sum(n / 10);
 */
