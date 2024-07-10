package Loops.java;
import java.util.Scanner;
public class ArithmeticProgression1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term : ");
        int a = sc.nextInt();
        System.out.print("Enter the common diff. : ");
        int d = sc.nextInt();
        System.out.print("Enter the nth term : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println(a);
            a = a + d;
        }
    }
}
