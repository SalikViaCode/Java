package BasicSorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int x = 0; x < arr.length; x++){
            arr[x] = sc.nextInt();
        }
        print(arr);
        for (int i = 1; i <= arr.length-1; i++){
            for (int j = 0; j < arr.length-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
