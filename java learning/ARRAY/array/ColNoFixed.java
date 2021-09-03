package array;

import java.util.Arrays;
import java.util.Iterator;

public class ColNoFixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {
				{1,2,3},
				{4,5},
				{6,7,8,9}
		};
		
	for (int row = 0; row < arr.length; row++) {
		for (int col = 0 ; col <arr[row].length ; col++) {
			System.out.print(arr[row][col]+" ");
			
//			arr.length is the size of row
//			col<arr[row].length means the the size of the col will be the size of that row 
			
		}
		System.out.println();
		
	}
	}

}
