package Strings.java;

import java.util.Scanner;

public class UpdateEvenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        for (int i = 0; i < s.length(); i++){
            if (i%2==0){
                str = str + 'a';
            } else {
                str = str + s.charAt(i);
            }
        }

        System.out.println(str);
    }
}
