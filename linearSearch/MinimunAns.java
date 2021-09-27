package linearSearch;

public class MinimunAns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {81,12,-7,3,6,97};
		System.out.println(min(arr));
	}
//	assume arr.length i=0;
//	return the minimum value in array
	
	static int min(int[] arr) {
		int ans =  arr[0];
	for (int i= 1 ; i <arr.length ; i++) {
		if(arr[i]<ans) {
			ans = arr[i];
		}
	}	
	return ans;
	}
}
