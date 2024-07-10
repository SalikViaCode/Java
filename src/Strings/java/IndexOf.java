package Strings.java;

public class IndexOf {
    public static void main(String[] args) {
        String s = "Salik Sayyed";
        System.out.println(s.indexOf('i'));
        System.out.println(s.indexOf('a')); //only first a
        System.out.println(s.lastIndexOf('a')); //a from last

        // Compare to
        String a = "abc";
        String b = "aac";
        System.out.println(a.compareTo(b));
        String c = "abcd";
        String d = "afgh";
        System.out.println(c.compareTo(d));
        String e = "abcdggg";
        String f = "abcd";
        System.out.println(e.compareTo(f));     //It prints the length of the extra characters

        //Contains,Starts with,Ends with
        String st = "Karl Jacob";
        System.out.println(st.contains("Jac"));
        System.out.println(st.contains("Jack"));
        System.out.println(st.contains(" Jac"));

        System.out.println(st.startsWith("Kar"));
        System.out.println(st.startsWith("Jac"));

        System.out.println(st.endsWith("cob"));
        System.out.println(st.endsWith("Kar"));
    }
}
