import java.util.Arrays;

public class MergeTwoArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] nums3 = nums1.clone();
        int i = 0, j = 0;
        
        for (int count = 0; count < m + n ; count++) {
            if (i == m) {
                nums1[count] = nums2[j];
                j++;
                continue;

            } else if (j == n) {
                nums1[count] = nums3[i];
                i++;
                continue;
            }
            if (nums3[i] <= nums2[j]) {
                nums1[count] = nums3[i];
                i++;
            } else {
                nums1[count] = nums2[j];
                j++;
            }
        }
        
        System.out.println(Arrays.toString(nums1));

    }
    public static void main(String[] args) {
        MergeTwoArray m = new MergeTwoArray();
        int[] nums1 = { 0 };
        int[] nums2 = { 2 };
        m.merge(nums1, 0, nums2, 1);
    }

}
