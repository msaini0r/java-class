package binarySearch;

public class FloorOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2 ,3 ,5 ,9 ,14 , 16, 18};
		int target = 15;
		int ans = ceilingofanumber(arr ,target);
		System.out.println(ans);
	}
//		return the index: greatest no <= target
		static int ceilingofanumber(int[] arr , int target) {
			int start = 0;
			int end = arr.length - 1;

			while (start <= end) {
//			find the middle element
//			int mid = start + end/2 .but when you takee a large number their sum can be more than the number of integer stored.
//			so use the below formula .
			
			int mid = start + (end - start) /2;
			
		if(target < arr[mid]) {
			end = mid -1;
			} else if (target > arr[mid]){
				start = mid +1;
			} else {
				return mid;
			}
		
		}
		return end;
	}

}
