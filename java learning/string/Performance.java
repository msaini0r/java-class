package string;

public class Performance {

	public static void main(String[] args) {
		
		
		String series = "";
		for (int i = 0; i < 26; i++) {
		char ch = (char)('a'+i);
		
	
		System.out.println(ch);
		
//		this add all the charaters together
		series = series +ch;
		}

		System.out.println(series);
	}
}
