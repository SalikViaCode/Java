package PatternPrinting.java;

import java.util.Scanner;

public class RotatedNumberSquare {
    public static void main(String[] args) {
        System.out.print("Enter the sides of the square : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
