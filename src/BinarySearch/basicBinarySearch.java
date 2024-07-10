package BinarySearch;

public class basicBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,5,16,25,54,64,72,96};
        int l = 0;
        int r = arr.length-1;
        int target = 96 ;
        boolean found = false;
        while (l<=r) {
            int mid = (l + r) / 2;
            if (arr[mid] < target) {
                l = mid + 1;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else if (arr[mid] == target) {
                System.out.println("Position : " + mid);
                found = true;
                break;
            }
        }
        if (found==false){
            System.out.println("Not Found");
        }
    }
}
