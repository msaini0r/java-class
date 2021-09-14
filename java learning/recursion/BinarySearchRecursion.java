package recursion;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    int[] arr= {1,2,3,4,55,63,78};
		    int target = 4;
		    System.out.println(search(arr,target,0,arr.length-1));
		    
		}

		static int search(int[] arr,int target,int s ,int e) {
		if(s>e){
		    return -1;   
		}
		int m= s+ (e-s)/2;
		if(arr[m] == target){
		    return m ;
		}
		if(target <arr[m]) {
		    return search(arr,target,s,m);
		}
		return search(arr,target,m+1,e);
		}
		}

	