package Strings.java;

import java.util.Scanner;

public class ReverseEachWordInASentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int i = 0;
        int j = 0;
        int n = sb.length();
        while (j<n){
            if (sb.charAt(j)!=' '){
                j++;
            }
            else {
                reverseStringBuilder(sb,i,j-1);
                i = j + 1;
                j = i;
            }
        }
        reverseStringBuilder(sb,i,j-1);
        System.out.println(sb);
    }

    private static void reverseStringBuilder(StringBuilder sb, int i, int j) {
        while (i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }
}