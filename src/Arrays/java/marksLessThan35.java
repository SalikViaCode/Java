package Arrays.java;

import java.util.Scanner;

public class marksLessThan35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Students : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the marks of Students : ");
        for (int i = 0; i < arr.length; i++){
            System.out.print("Marks of Roll No."+i+" ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Following Roll No. got marks less than 35 : ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i]<35){
                System.out.println(arr[i]);
            }
        }
    }
}
