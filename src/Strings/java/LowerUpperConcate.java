package Strings.java;

public class LowerUpperConcate {
    public static void main(String[] args) {
        //Upper case lower case character
        String a = "abc";
        String b = "def";
        a.toUpperCase();    //nothing happens because not stored
        System.out.println(a);
        System.out.println(a.toUpperCase());
        a = a.toUpperCase();
        System.out.println(a);
        System.out.println(a.toLowerCase());

        //concatination
        System.out.println(a+b);
        System.out.println(a.concat(b));


    }
}
