package binarySearch;

public class PeakIndexInMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	    public int peakIndexInMountainArray(int[] arr) {
	        int start=0;
	        int end = arr.length-1;
	        
	        while(start <end){
	        int mid = start +(end-start)/2;
	        if(arr[mid]>arr[mid+1]){
//	        	you are in desending part of arr
//	        	this may be ans but look at left
//	        	this is why end !=mid-1
	            end=mid;
	        }else{
//	        	you are in ascending part of arr
	            start =mid+1;
	        }
	        }
	        return start;
	    }
	}
