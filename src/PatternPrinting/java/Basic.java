package PatternPrinting.java;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int columns = sc.nextInt();
        for (int i = 1; i <= rows; i++){    //rows
            for (int j = 1; j <= columns; j++){     //columns
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
