package binarySearch;

public class OdinaryAgnosticBS {

	public static void main(String[] args) {
		int[] arr = {-12, -4, -3, 0, 5, 7, 11, 14, 19};
		int target = 19;
		int ans = odinaryAgnosticBS(arr ,target);
		System.out.println(ans);
	}
		static int odinaryAgnosticBS(int[] arr, int target) {
			int start = 0;
			int end = arr.length - 1;
			
		boolean isAsc;

		if(arr[start] < arr[end]) {
		isAsc = true;
		} else {
		isAsc = false;
		}
		
		
		while (start <= end) {
//			find the middle element
//			int mid = start + end/2 .but when you takee a large number their sum can be more than the number of integer stored.
//			so use the below formula .
			
			int mid = start + (end - start) /2;
			
			if (arr[mid] == target) {
				return mid;
			}
			
			if(isAsc) {
		if(target < arr[mid]) {
			end = mid -1;
			} else if (target > arr[mid]){
				start = mid +1;
			} 
			
			} else {
				if(target > arr[mid]) {
					end = mid -1;
					} else if (target < arr[mid]){
						start = mid +1;
					} 
			}
		}
			return -1;
	}

}

