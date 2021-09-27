package sorting;

import java.util.Arrays;

public class CyclicSort {

	// when given numbers from 1 to N use cyclic sort
	// the worst case posssible is - O(N)
	
	public static void main(String[] args) {
		
		int[] arr = {3,5,2,1,4};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	static void sort(int[] nums) {
		int i=0;
		while(i<nums.length) {
			int correct = nums[i] - 1;
			if(nums[i] != nums[correct]) {
				swap(nums,i,correct);
			} else {
				i++;
		}
	}
	}
		
		static void swap (int[] nums,int first ,int second) {

			int temp = nums[first];
			nums[first] = nums[second];
			nums[second] = temp;
		}
}
