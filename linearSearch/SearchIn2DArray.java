package linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] arr = {
				{42, 54,6},
				{21, 33, 9, 92 },
				{14, 63 ,84 ,72},
				{18, 12},
		};
		int target = 63;
		int[] ans = search(arr,target); //format of return value row,col
		System.out.println(Arrays.toString(ans));
	}

static int[] search(int[][] arr, int target) {
for (int row = 0; row < arr.length; row++) {
for (int col = 0; col < arr[row].length; col++) {
	if(arr[row][col]== target) {
		return new int[]{row,col};
	}

}
}
return new int[] {1,-1};
}
}

