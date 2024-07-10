package Arrays.java;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 6;
        int[] result = twoSum(arr,target);
        if (result.length > 0){
            System.out.println(result[0]+","+result[1]);
        }
    }

    private static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}