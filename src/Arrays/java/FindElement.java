package Arrays.java;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array : ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be find : ");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++){
            if (arr[i]==element){
                System.out.println(element+" is present at "+i+" ");
            }
        }
    }
}
