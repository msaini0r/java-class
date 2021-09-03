package binarySearch;

public class Search{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	int[] arr = {-12, -4, -3, 0, 5, 7, 11, 14, 19};
	int target = 7;
	int ans = binarySearch(arr ,target);
	System.out.println(ans);
}
//	return the index
//	return -1 if index not exist
	static int binarySearch(int[] arr , int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
//		find the middle element
//		int mid = start + end/2 .but when you takee a large number their sum can be more than the number of integer stored.
//		so use the below formula .
		
		int mid = start + (end - start) /2;
		
	if(target < arr[mid]) {
		end = mid -1;
		} else if (target > arr[mid]){
			start = mid +1;
		} else {
			return mid;
		}
	
	}
		return -1;
}
}
