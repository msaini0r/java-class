package recursion;

public class Passing_Number_Concept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
            if(n==0){
                return;
            }
            System.out.println(n);
//            fun(n--);
        fun(--n);

        // their is  a big difference between n-- and --n
    }

}
