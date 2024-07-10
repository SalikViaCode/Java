package DataTypes.java;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle : ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = 3.14 * r * r;
        System.out.print("The area of the circle is : "+area);

    }
}
