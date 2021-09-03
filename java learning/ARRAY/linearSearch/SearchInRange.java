package linearSearch;

public class SearchInRange {

	public static void main(String[] args) {
		int[] arr = {18,21,3,92,-17,60};
		int target = 3;
	
		System.out.println(linearSearch(arr,target,1,4));
	}
		static int linearSearch(int[] arr , int target , int start , int end) {
		if (arr.length == 0) {
		return -1;

	}
		
//		run for a loop
		for (int index = start ; index <=end ; index++) {
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
