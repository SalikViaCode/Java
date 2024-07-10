package Strings.java;

import java.util.Arrays;

public class StringSorting {
    public static void main(String[] args) {
        String s = "salik"; //strings cannot be sort directly
        char[] ch = s.toCharArray();    //converting string into array
        for (char ele : ch){
            System.out.print(ele+"");   //printing elements of array
        }
        System.out.println();
        Arrays.sort(ch);    //sorting array
        for (char ele : ch){
            System.out.print(ele+"");   //printing elements of array
        }
        System.out.println();
        //Note that capitals letters have higher priority than small irrespective of the alphabetical order
        //Similarly string builder also cannot sort directly it needs to be converted into String and then
        //into an array

        StringBuilder sb = new StringBuilder("sayyed");
        String sbd = sb.toString();
        char[] chr = sbd.toCharArray();
        Arrays.sort(chr);
        for (char ele : chr){
            System.out.print(ele+"");   //printing elements of array
        }

    }

}
