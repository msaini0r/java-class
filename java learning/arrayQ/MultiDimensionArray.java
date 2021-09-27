package arrayQ;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {

public static void main(String[] args) {

	
	
	/*
	 * 
	 * syntax of matrix
	 * 7 8 9
	 * 1 2 6
	 * 7 4 3
	 */
	Scanner in= new Scanner(System.in);
//	int[][] arr = new int[3][];
//	int[][] arr = {
//			{1,2,3}, //0 th index
//			{4,5}, //1st index
//			{6,7,8,9} //2nd index
//	};
//	
	int[][] arr = new int [3][3];
	System.out.println(arr.length); //no of runs
	
	// input
	
	for(int row = 0 ; row<arr.length;row++) {
		// for each col in every row
		for(int col = 0 ; col < arr[row].length ; col++) {
			arr[row][col] = in.nextInt();
		}
	} 
			
//			output
			
//	you can use this highlighted one or the one below in short form
	
//			for (int row = 0 ; row< arr.length; row++) {
//				// for each col in every row
//				for (int col = 0 ; col < arr[row].length ; col++) {
//					System.out.print(arr[row][col]+" ") ;
//		}
//				System.out.println(); //this is used to give matrix form
				
				
			
				  for (int row = 0 ; row <arr.length ; row++) {
				  System.out.println(Arrays.toString(arr[row]));
				  
//     			  or you can use the third method is
				  
//				  for (int[] a : arr) {
//				  System.out.println(Arrays.toString(a)); // most easiest way to remember 
				  
// int is data type here , a is the string element which is array , and in that the same element is also array(denoted by arr)
				  
//				  }
//				 
				  
			}
		}
}

	


