package Arrays.java;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {54,21,65,48,74};
        int[] b = {11,69,45,12,30};
        int[] c = new int[a.length+b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length){
            if (a[i]<=b[j]){
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if (i==a.length){   //take elements from b
            while (j<b.length){
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if (j==b.length){   //take elements from b
            while (i<a.length){
                c[k] = a[i];
                i++;
                k++;
            }
        }
        for (int ele : c){
            System.out.print(ele+" ");
        }
    }
}
