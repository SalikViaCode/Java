package BasicSorting;

import java.util.ArrayList;
import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        ArrayList<Integer> nums = new ArrayList();
        int noz = 0;
        for (int ele : arr){
            if (ele!=0)   nums.add(ele);
            else noz++;
        }
        for (int i = 0; i < noz; i++){
            nums.add(0);
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = nums.get(i);
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
