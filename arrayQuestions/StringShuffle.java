package arrayQuestions;

public class StringShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String restoreString(String s, int[] indices) {
	char temp[] = new char[indices.length];
	for (int i = 0; i < indices.length; i++) {
		temp[indices[i]] = s.charAt(i);
	}
	return new String(temp);
}


}
