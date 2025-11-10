class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++) {
            if(hm.containsKey(nums[i])) {
                int previousIndex = hm.get(nums[i]);
                if(Math.abs(i - previousIndex) <= k) {
                    return true;
                }
            }
            hm.put(nums[i], i);
        }
        return false;
    }
}