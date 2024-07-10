package Strings.java;

import java.util.Scanner;

public class BuiltInMethodsInStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String s = sc.nextLine();
        System.out.print("Enter the char position : ");
        int i = sc.nextInt();
        System.out.println(s.charAt(i));
        System.out.print("Lenght of the String : "+s.length());

    }
}
