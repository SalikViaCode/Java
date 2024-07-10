package BinarySearch;

public class upperBound {
    public static void main(String[] args) {
        int[] arr = {10, 20, 35, 40, 40, 46, 52, 56, 60};
        int n = arr.length;
        int target = 40;
        int lb = n;
        int l = 0;
        int r = n - 1;
        while (l<=r){
            int mid = (l+r)/2;
            if (arr[mid]>target){
                lb = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(lb);
    }
}
