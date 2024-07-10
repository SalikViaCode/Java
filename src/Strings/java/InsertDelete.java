package Strings.java;

public class InsertDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        sb.deleteCharAt(3);
        System.out.println(sb); //abcef
        System.out.println(sb.charAt(3));
        sb.append("xyz");
        System.out.println(sb); //abcefxyz
        sb.delete(2,5);
        System.out.println(sb); //abxyz
        sb.insert(2,'$');
        System.out.println(sb); //ab$xyz
        sb.insert(5,"Dellulu");
        System.out.println(sb); //ab$xyDelluluz
        sb.insert(13,69);
        System.out.println(sb); //ab$xyDelluluz69
    }
}
