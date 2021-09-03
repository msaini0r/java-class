package binarySearch;

public class FirstAndLastPosition{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

	public int[] searchRange(int[] num ,int target) {
		
		int[] ans = {-1,-1};
		
//		check for first occurrence of target first
		int start = search(num, target, true);
		int end = search(num, target, false);
		
		ans[0] = start ;
		ans[1] = end;
		
		return ans;
	}

//	this function just returns the index value of target
	int search(int[] num , int target, boolean findStartIndex) {
		
		int ans = -1;
		int start = 0;
		int end = num.length-1;
		
		int mid = start + (end - start) /2;
		
		if(target < num[mid]) {
			end = mid -1;
			} else if (target > num[mid]){
				start = mid +1;
			} else {
				//potential ans found
				ans = mid;
			if(findStartIndex) {
					end = mid-1;
			}else {
				start = mid +1;
			}
	
}
	return ans;
}
}

