package binarySearch;

public class TwoSum2 {

	public static void main(String[] args) {
	
	
	}
public int[] twoSum(int[] numbers, int target) {
        
        int start = 0;
        int end = numbers.length - 1;
        while(start < end){
            if(numbers[start] + numbers[end] == target){
                break;
            }
            if(numbers[start] + numbers[end] < target) {
                start++;
            }else {
                end--;
        }
        
    }
        return new int[]{start + 1, end + 1};
        
    }
}