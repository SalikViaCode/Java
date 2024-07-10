package Arrays.java;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        int smax = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] != max){
                if (arr[i]>smax){
                    smax = arr[i];
                }
            }
        }
        System.out.println("Second largest element is "+smax);
    }
}