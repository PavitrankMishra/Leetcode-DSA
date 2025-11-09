class Solution {
    // num1 num2   num1 num2
    // 5    4      2    3
    // 1    4      2    1
    // 1    3      1    1
    // 1    2      0    1
    // 1    1
    // 0    1
    public int countOperations(int num1, int num2) {
        int total_Operations = 0;
        while(num1 >0 && num2 > 0) {
            if(num1 >= num2) {
                num1 = num1 - num2;
                total_Operations++;
            } else if(num2 > num1) {
                num2 = num2 - num1;
                total_Operations++;
            }
        }

        return total_Operations;
    }
}