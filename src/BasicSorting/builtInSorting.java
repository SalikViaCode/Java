package BasicSorting;

import java.util.Arrays;

public class builtInSorting {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
}
