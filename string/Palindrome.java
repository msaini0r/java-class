package string;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcba";
		System.out.println(isPalindrome(str));
		
	}
	static boolean isPalindrome(String str) {
//		this check is basically if we put string as null
		if(str == null || str.length()==0) {
			return true;
		}
		str=str.toLowerCase();
		for (int i = 0; i < str.length()/2; i++) {
			char start = str.charAt(i);
			char end = str.charAt(str.length()-1-i);
			
			if(start !=end){
				return false;
				}
		}

		return true;
	}

}
