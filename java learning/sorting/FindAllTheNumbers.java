//ASKED IN GOOGLE INTERVIEW

package sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllTheNumbers {

	public static List<Integer> findDisapparedNumbers(int[] nums) {
		// TODO Auto-generated method stub

		int i=0;
		while(i<nums.length) {
			int correct = nums[i] - 1;
			if(nums[i] != nums[correct]) {
				swap(nums,i,correct);
			} else {
				i++;
		}
	}
		//just finding missing number.
	  List<Integer> ans = new ArrayList<>();
	  for (int index = 0; index < nums.length; index++) {
		  if(nums[index] != index+1 ) {
			  ans.add(index+1);
		  }
	}
		  return ans;
		
	}
		
		static void swap (int[] arr,int first ,int second) {

			int temp = arr[first];
			arr[first] = arr[second];
			arr[second] = temp;
		}
}




