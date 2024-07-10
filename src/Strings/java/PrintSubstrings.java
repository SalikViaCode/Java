package Strings.java;

public class PrintSubstrings {
    public static void main(String[] args) {
        String s = "abcde";
        for (int i = 0; i <= s.length(); i++){
            System.out.println();
            for (int j = i + 1; j <= s.length(); j++){
                System.out.print(s.substring(i,j)+" ");
            }
        }
    }
}
