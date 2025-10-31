class Solution {
    public int smallestNumber(int n) {
        int i = 0;
        int startValue = (int)Math.pow(2, i);
        while(startValue <= n) {
            i++;
            startValue = (int) Math.pow(2, i);
        }

        return startValue-1;
    }
}