package binarySearch;

public class DistanceBetweenTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
	        int ans = 0;
	        for(int i=0; i<arr1.length; i++) {
	            ans++;
	            for(int j=0; j<arr2.length; j++) {
	                if(Math.abs(arr1[i] - arr2[j]) <= d) {
	                    ans--;
	                    break;
	                }
	            }
	        }
	        return ans;
	    }
	}
