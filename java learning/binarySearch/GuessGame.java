package binarySearch;


public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class Solution extends GuessGame {
	    public int guessNumber(int n) {
	    	

	    	int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
	    	int target = 7;
	    	int ans = GuessGame(arr ,target);
	    	System.out.println(ans);
			return ans;
	    }
//	    	return the index
//	    	return -1 if index not exist
	    	public int GuessGame(int[] arr , int target) {
	    		int start = 0;
	    		int end = arr.length - 1;

	    		while (start <= end) {
//	    		find the middle element
//	    		int mid = start + end/2 .but when you takee a large number their sum can be more than the number of integer stored.
//	    		so use the below formula .
	    		
	    		int mid = start + (end - start) /2;
	    		
	    	if(target < arr[mid]) {
	    		return -1;
	    		} else if (target > arr[mid]){
	    			return 1;
	    		} 
	    	
	    		}
			return 0;
	    		
	    }
	    }

}