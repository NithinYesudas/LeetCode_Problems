import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
               
                if (nums[i] + nums[j] == target) {
                    
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        TwoSum ts =  new TwoSum();
        int[] arr = {1,2,3,4,5,6};
        int[] result = ts.twoSum(arr, 10);
        System.out.println(result[0]);
        System.out.println(result[1]);

    }
}