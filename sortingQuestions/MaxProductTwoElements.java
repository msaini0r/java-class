package sortingQuestions;

import java.util.Arrays;

public class MaxProductTwoElements {
    public static void main(String[] args) {

    }
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return ((nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1));
    }
}
