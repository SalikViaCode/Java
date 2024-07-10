package Arrays.java;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] copy = arr;   //shallow copy
        for (int i = 0; i < copy.length; i++){
            System.out.print(copy[i]+" ");
        }
        System.out.println();
        copy[0] = 54;   //changes at the index of copy but value of arr also change
        System.out.println(arr[0]); //which means there is only copy of array
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[1] = 69;
        System.out.println(arr[1]);
    }
}
