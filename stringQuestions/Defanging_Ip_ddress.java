package stringQuestions;

public class Defanging_Ip_ddress {
    public static void main(String[] args) {

    }

    public String defangIPaddr(String address) {

        return address.replace(".", "[.]");
    }
}
