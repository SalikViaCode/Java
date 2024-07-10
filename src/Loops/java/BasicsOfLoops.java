package Loops.java;

import java.util.Scanner;

public class BasicsOfLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println((i+1)+" Hello World");
        }
    }
}
