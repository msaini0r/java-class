package arrayQuestions;

import java.util.Arrays;

public class singleNumber {
  public static void main(String[] args){

  }

    public int singleNumber(int[] nums) {
        int ans = nums[0];
        int n = 0;
        n = nums.length;
        for (int i = 1; i < n; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
