package Strings.java;

import java.util.Scanner;

public class StringBuilderInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
        System.out.print("Take Input StringBuilder : ");
        StringBuilder sbr = new StringBuilder(sc.nextLine());
        System.out.println(sbr);
        sb.setCharAt(0,'s');
        System.out.println(sb);
    }
}
