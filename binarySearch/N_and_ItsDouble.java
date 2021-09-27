package binarySearch;

public class N_and_ItsDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean checkIfExist(int[] arr) {
	        for(int i=0; i<arr.length ; i++) {
	            for(int j=0; j<arr.length ; j++){
	                if(i == j){
	                    continue;
	                }if(arr[i] == 2*arr[j]){
	                return true;
	                }
	        }
	        
	    }
	        return false;
	}
	}
