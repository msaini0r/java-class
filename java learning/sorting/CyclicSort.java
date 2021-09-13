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

	static void sort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct = arr[i] - 1;
			if(arr[i] != arr[correct]) {
				swap(arr,i,correct);
			} else {
				i++;
		}
	}
	}
		
		static void swap (int[] arr,int first ,int second) {

			int temp = arr[first];
			arr[first] = arr[second];
			arr[second] = temp;
		}
}
