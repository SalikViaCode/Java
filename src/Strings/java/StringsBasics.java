package Strings.java;
import java.util.Scanner;
public class StringsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String s = sc.next();
        System.out.println("Hi "+s);
    }
}
