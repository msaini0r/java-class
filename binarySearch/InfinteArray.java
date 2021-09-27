package binarySearch;

public class InfinteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,5,7,11,16,25,39,46,54,86,99};
		int target = 25;
		System.out.println(ans(arr,target));
	}
	
	static int ans(int[] arr, int target) {
//	first find the range 
//	first start a box of size 2
	
	int start = 0;
	int end = 1;
	
//	condition for the target to lie int the range
	while(target > arr[end]) {
		int temp = end +1; //this is my new start
//		double the box value
//		end = previous end + size of box*2
		end = end + (end-start+1)*2;
		start = temp;
	}
	
	return binarySearch(arr,target,start,end);
	}
	static int binarySearch(int[] arr , int target,int start , int end) {
		
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
