package Arrays.java;

import java.util.Scanner;

public class MaximumValueElement {
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
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print("Max element is "+max);
    }
}
