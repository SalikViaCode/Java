package Loops.java;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose table you want : ");
        int n = sc.nextInt();
        for (int i = n; i <= n*10; i = i + n){
            System.out.println(i);
        }
    }
}
