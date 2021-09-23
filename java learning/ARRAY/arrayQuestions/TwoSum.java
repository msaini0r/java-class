package arrayQuestions;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] twoSum(int[] nums, int target) {
        for(int i=0; i< nums.length - 1; i++)
        {
            for(int j=i+1; j< nums.length; j++)
            {
                int z=0;
                    z= nums[i] + nums[j];
                if(target == z)
                {
                    return new int[]{i,j};
            }
        }
         
    }return new int[2];
    }
}

