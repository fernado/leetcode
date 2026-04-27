package pr.iceworld.fernando.leetcode.easy;

public class lc_0026_remove_duplicates_from_sorted_array {

    static class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] != nums[k]) {
                k++;
                nums[k] = nums[i + 1];
            }
        }
        return k + 1;

    }
}

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        int i = new Solution().removeDuplicates(nums);
        System.out.println(i);
    }
}
