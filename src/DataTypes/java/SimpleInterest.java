package DataTypes.java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter P :");
        double p = sc.nextDouble();
        System.out.print("Enter R :");
        double r = sc.nextDouble();
        System.out.print("Enter T :");
        double t = sc.nextDouble();
        double si = (p*r*t)/100;
        System.out.println("Simple Interest is "+si);
    }
}
