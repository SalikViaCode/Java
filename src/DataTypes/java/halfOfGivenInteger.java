package DataTypes.java;

import java.util.Scanner;

public class halfOfGivenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer : ");
        int a = sc.nextInt();
        double x = (double) a;
        System.out.print("Half of the Integer is : ");
        System.out.println(x/2);

        System.out.print("Enter the double : ");
        double d = sc.nextDouble();
        int y = (int) d;
        System.out.println(y);
    }
}
