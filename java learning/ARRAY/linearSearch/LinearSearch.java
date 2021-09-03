package linearSearch;



public class LinearSearch {

	public static void main(String[] args) {
	
		int[] nums = {81,42,39,22,11,69};
		int target = 39;
		int ans = linearSearch(nums , target);
		System.out.println(ans);
	}
		
		
//		search in the array: retuen the index if item found
//		otherwise if nit found return -1
		
		static int linearSearch(int[] arr , int target) {
		if (arr.length == 0) {
		return -1;

	}
		
//		run for a loop
		for (int index = 0 ; index <arr.length ; index++) {
//			check for every element at every index if it is = target
			int element = arr[index];
			if (element == target) {
				return index;
			}
		}
		
//		this line will be executed if none of the above statements have been executed
//		hence the target not found
		return -1;
	}

}
