package Conditional.java;

import java.util.Scanner;

public class YoungestAmongThreeWithoutOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of 1st person : ");
        int a = sc.nextInt();
        System.out.print("Enter the age of 2nd 0person : ");
        int b = sc.nextInt();
        System.out.print("Enter the age of 3rd person : ");
        int c = sc.nextInt();

        if (b<c){
            if (a<b){   // a < b < c
                System.out.println(a+" is the smallest");
            } else {    // b < c < a
                System.out.println(b+" is the smallest");
            }
        } else if (c < a) {
            if (c < b){     // b < c < a
                System.out.println(c+" is the smallest");
            } else {    // c < b < a
                System.out.println(c+" is the smallest");
            }
        }

    }
}
