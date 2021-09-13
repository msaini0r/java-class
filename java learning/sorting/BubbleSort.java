/*
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly SWAPPING the adjacent elements if they are in wrong order.
 * 
 * In bubble sort the best case is = 0(N)
 * In bubble sort the worst case is =O(N^2)
 * 
 *		Time complexity basically means the total number of comparisons.
 * 
 * bubble sort is a stable sorting algorithm it means the original order is maintained for the same values.
 */



package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,3,2,4,1};
		bubble(arr);
		System.out.println(Arrays.toString(arr));
		}

	static void bubble(int[] arr) {
		boolean swapped;
//		run the steps n-1 times
		for (int i = 0; i < arr.length; i++) {
			swapped = false;
//   for each steps,max item will come at the last respective index
			for (int j = 1; j < arr.length; j++) {
// swap if the item is smaller than the previous item.
				if(arr[j] < arr[j-1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped =true;
				}
			}
//if you did not swap for a particular value of i , it means the array is sorted. hence stop the program.

			if(!swapped) { // !false =true
				break;
			}
		}
}
}
