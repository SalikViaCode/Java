package Conditional.java;

import java.util.Scanner;

public class DivissibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you wants to check if it is divisible by 5 or Not :");
        int n = sc.nextInt();
        if (n%5==0){
            System.out.println("Yup "+n+" is divisible by 5");
        }else {
            System.out.println("Nope "+n+" is not divisible by 5");
        }
    }
}
