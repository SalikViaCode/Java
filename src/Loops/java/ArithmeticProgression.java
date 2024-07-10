package Loops.java;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        //  an = a + (n-1)d
        //  an = 1 + (n-1)2
        //  an = 1 + 2n - 2
        //  an = 2n - 1
       for (int i = 1; i <= (2*n-1); i = i +2){
           System.out.println(i);
       }
        System.out.print("Enter the number : ");
       int m = sc.nextInt();
       //   4,7,10,13,....
        int a = 4;
        for (int i = 1; i <= m;i++){
            System.out.println(a);
            a = a+3;

        }
    }
}
