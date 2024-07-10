package Strings.java;

public class Equals {
    public static void main(String[] args) {
        String a = "abcdef";
        String b = "abcdef";
        String c = new String(b);
        String d = "abc";
        d = d + "def";
        System.out.println(a==b);   //new string is not created here b is pointed towards a's string
        System.out.println(a==c);   //new string is created so address doesn't match '==' compares addresses
        System.out.println(a==d);

        // For this we uses equals to
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
    }
}
