package BasicSorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,-5,4,6,2};
        print(arr);
        for (int i = 0; i < arr.length-1; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i; j < arr.length; j++){
                if (arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }
            }
            //Swapping
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
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

