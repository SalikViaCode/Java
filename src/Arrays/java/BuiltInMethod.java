package Arrays.java;

import java.util.Arrays;

public class BuiltInMethod {
    public static void main(String[] args) {
        int[] arr = {20,40,13,52,31};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
