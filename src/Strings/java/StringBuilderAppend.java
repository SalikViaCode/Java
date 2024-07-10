package Strings.java;

import java.util.Scanner;

public class StringBuilderAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("ABC");
        sb.append('*');
        sb.append(65);
        sb.append("xyz");
        sb.append(true);
        char[] ch = {'s','a','l'};
        sb.append(ch);
        System.out.println(sb);
        int[] arr = {1,2,3};
        sb.append(arr);
        System.out.println(sb); //appends adress
    }
}
