package arrayQuestions;

public class SumOf1DARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}		 
		 public int[] runningSum(int[] nums) {
		      
		        for(int i = 0 ; i < nums.length-1; i++) 
		            nums[i+1] += nums[i];
		        return nums;
		    }
		}
		    
