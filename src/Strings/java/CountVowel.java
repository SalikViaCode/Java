package Strings.java;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String n = sc.nextLine();
        int count = 0;
        for (int i = 0; i < n.length(); i++){
            char ch = n.charAt(i);
            if (isVowel(ch)==true){
                count++;
            }
        }
        System.out.print("Number of vowels : "+count);
    }

    public static boolean isVowel(char ch) {
        if (ch=='a' || ch=='A') return true;
        if (ch=='e' || ch=='E') return true;
        if (ch=='i' || ch=='I') return true;
        if (ch=='o' || ch=='O') return true;
        if (ch=='u' || ch=='U') return true;
        return false;
    }
}