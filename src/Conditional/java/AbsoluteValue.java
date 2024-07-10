package Conditional.java;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <=1; i++){
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            if (n<0){
                System.out.print("Absolute Value is : ");
                System.out.println(-n);
            }else {
                System.out.print("Absolute Value is : ");
                System.out.println(n);
            }
        }
    }
}
