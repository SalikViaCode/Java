package Arrays.java;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
