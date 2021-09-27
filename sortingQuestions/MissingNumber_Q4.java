package sortingQuestions;

public class MissingNumber_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int missingNumber(int[] nums) {
		 
		int n = nums.length;
        int sum = 0;
        for(int i=0 ; i<n ; i++)
            sum += nums[i];
        return ((n*(n+1))/2-sum);
		}
}

