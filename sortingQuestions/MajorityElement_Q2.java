package sortingQuestions;

import java.util.Arrays;

public class MajorityElement_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int majorityElement(int[] nums) {
     	
		 Arrays.sort(nums);
		 	return nums[nums.length / 2];
		     }
		 }


