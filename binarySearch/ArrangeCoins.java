package binarySearch;

public class ArrangeCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int arrangeCoins(int n) {
		
	        int res =0;
	        for(res=1;res<=n;res++){
	            n=n-res;
	       
	    }
	         return res-1;
	    }
	}