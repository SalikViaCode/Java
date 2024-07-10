package Loops.java;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st term : ");
        int a = sc.nextInt();
        System.out.print("Enter the common ratio : ");
        int r = sc.nextInt();
        System.out.print("Enter the last term : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println(a);
            a = a * r;
        }
    }
}
