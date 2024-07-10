package Conditional.java;

import java.util.Scanner;

public class FiveDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>9999 && n<100000){
            System.out.println(n+" is five digit number");
        } else {
            System.out.println(n+" is not a five digit number");
        }
    }
}
