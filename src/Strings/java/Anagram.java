package Strings.java;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public boolean Main(String s, String t){
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        t = sc.nextLine();
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (a==b){
            return true;
        } else {
            return false;
        }
    }
}
