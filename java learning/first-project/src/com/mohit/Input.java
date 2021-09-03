package com.mohit;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please input some value");
        int rollno = input.nextInt();
        System.out.println("your roll number is" + rollno);
    }
}
