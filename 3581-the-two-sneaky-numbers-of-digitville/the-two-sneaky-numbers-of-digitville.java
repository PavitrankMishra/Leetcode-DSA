import java.util.Arrays;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        Arrays.sort(nums);
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                System.out.println(nums[i]);
                result[j++] = nums[i];
            }
        }
        return result;
    }
}