package stringQuestions;

public class Two_String_Equal {
    public static void main(String[] args) {

    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = String.join("", word1);
        String s2 = String.join("", word2);
        return s1.equals(s2);
    }
}
