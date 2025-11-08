class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<Integer>();

        for(int num:nums1) {
            m1.put(num, m1.getOrDefault(num, 0) + 1);
        }

        for(int num:nums2) {
            if(m1.containsKey(num) && m1.get(num) > 0) {
                result.add(num);
                m1.put(num, m1.get(num)-1);
            }
        }


        int [] res = new int [result.size()];
        for(int i=0;i<result.size();i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}