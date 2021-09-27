package binarySearch;

public class SmallestNumber {

	public static void main(String[] args) {
		
	}
	
	public char nextGreatestLetter(char[] letters, char target) {
		
			int start = 0;
			int end = letters.length - 1;

			while (start <= end) {
//			find the middle element
//			int mid = start + end/2 .but when you takee a large number their sum can be more than the number of integer stored.
//			so use the below formula .
			
			int mid = start + (end - start) /2;
			
		if(target < letters[mid]) {
			end = mid -1;
			} else {
				start = mid +1;
			} 
		
		}
		return letters[start % letters.length];

	}

}

