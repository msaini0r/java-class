package binarySearch;

public class ValidPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isPerfectSquare(int num) {
	      long start=0;
	        long end = num;
	        
	        while(start<=end){
	            long mid = start+(end-start)/2;
	            
	            if(mid*mid == num){
	                return true;
	            } else if(mid*mid > num){
	                end=mid-1;
	                
	            } else{
	                start = mid+1;
	            }
	            }
	        return false;
	        }
	        
	    }