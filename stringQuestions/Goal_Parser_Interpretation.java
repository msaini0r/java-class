package stringQuestions;

public class Goal_Parser_Interpretation {
    public static void main(String[] args) {

    }

    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
