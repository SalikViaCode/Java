package PatternPrinting.java;

import java.util.Scanner;

public class RotatedAlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print((char) (i+64)+" ");
            }
            System.out.println();
        }
    }
}
