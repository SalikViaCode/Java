package Arrays.java;

import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr+" "+arr.size());
        arr.add(0,10);
        System.out.println(arr+" "+arr.size());
        arr.add(1,20);
        System.out.println(arr+" "+arr.size());
        arr.add(2,30);
        System.out.println(arr+" "+arr.size());
        arr.add(3,40);
        System.out.println(arr+" "+arr.size());
        arr.add(4,50);
        System.out.println(arr+" "+arr.size());
        arr.remove(3);
        System.out.println(arr);
        System.out.println(arr.get(3));

    }
}
