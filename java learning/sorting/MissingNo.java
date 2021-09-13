package sorting;

import java.util.Arrays;

public class MissingNo {

public static void main(String[] args) {
	int[] arr = {4,0,2,1};
	System.out.println(MissingNo(arr));
}

	public static int MissingNo(int[] nums) {
		int i=0;
		while(i<nums.length) {
			int correct = nums[i];
			if(nums[i] < nums.length && nums[i] != nums[correct]) {
				swap(nums,i,correct);
			} else {
				i++;
		}
	}
//		search for first missing number
		for(int index = 0;index < nums.length;index++) {
			if(nums[index] != index){
				return index;
			}
		}
//		in case 2
		return nums.length;
	}
		
		static void swap (int[] arr,int first ,int second) {

			int temp = arr[first];
			arr[first] = arr[second];
			arr[second] = temp;
		}
}

