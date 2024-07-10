package BasicSorting;

public class checkIfSorted {
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 50, 60};
        int n = arr.length;
        boolean flag = true;
        for (int i = 0; i <n-1; i++){
            if (arr[i]>arr[i+1]){
                flag = false;
            }
        }
        if (flag==true) System.out.println("Sorted");
        else System.out.println("Unsorted");
    }
}
