package binarySearch;

public class RotatedBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			
			int[] arr = {4,5,6,7,0,1,2};
			System.out.println(findPivot(arr));
		}

		static int findPivot(int[] arr) {
			int start = 0;
			int end = arr.length-1;
			while (start <= end) {
			int mid = start + (end - start) /2;
			// 4 cases possible
			
			if (mid < end && arr[mid] > arr[mid+1]) {
				return mid;
			}
			if(mid > end && arr[mid] > arr[mid-1]) {
			return  mid-1;	
			}
			if(arr[mid] <= arr[start]) {
				return mid-1;
			} else {
				return mid +1;
			}
		}
		return -1;
		}
		}


