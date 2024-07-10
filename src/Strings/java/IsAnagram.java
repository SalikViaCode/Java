package Strings.java;

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {
    public boolean Main(String s, String t) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        char[] cha = a.toCharArray();
        char[] chb = b.toCharArray();
        Arrays.sort(cha);
        Arrays.sort(chb);
        if (cha==chb){
            return true;
        } else {
            return false;
        }
    }
}
