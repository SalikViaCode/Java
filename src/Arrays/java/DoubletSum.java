package Arrays.java;

import java.util.Scanner;

public class DoubletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the combination you want : ");
        int cmb = sc.nextInt();
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] + arr[j] == cmb){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
