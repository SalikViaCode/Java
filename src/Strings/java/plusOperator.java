package Strings.java;

public class plusOperator {
    public static void main(String[] args) {
        String a = "abc";
        String b = "def";
        System.out.println(a+b);
        System.out.println(10+20+"abc");    //first addition is performed and then string is added
        System.out.println("abc"+10+20);    //first addition happens and then string came so it concatinate with resut
    }
}
