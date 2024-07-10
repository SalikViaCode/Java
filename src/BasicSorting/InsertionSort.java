package BasicSorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,-6,5,3,-2};
        print(arr);
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j >= 1; j--){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }
        print(arr);

    }
    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

