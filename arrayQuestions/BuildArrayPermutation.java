package arrayQuestions;

public class BuildArrayPermutation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		}  
	
	public int[] buildArray(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			ans[i] = nums[nums[i]];
		}
		return ans;
	}
		}
