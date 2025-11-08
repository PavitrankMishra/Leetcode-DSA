class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }

        int total_Moves = 0;

        for(int i=0;i<nums.length;i++) {
            total_Moves += max - nums[i];
        }
        return total_Moves;
    }
}