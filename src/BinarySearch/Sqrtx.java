package BinarySearch;

import java.util.Scanner;

public class Sqrtx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x : ");
        int x = sc.nextInt();
        int l = 0, h = x;

        while (l <= h) {
            int mid = l + (h - l) / 2; // Prevent potential overflow
            if (mid * mid == x) {
                System.out.println(mid);
                return; // Exit the program once the result is found
            } else if (mid * mid > x) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        System.out.println(h); // Print h if the loop exits due to l > h
    }
}
