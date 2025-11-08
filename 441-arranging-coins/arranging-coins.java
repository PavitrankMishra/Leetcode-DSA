class Solution {
    public int arrangeCoins(int n) {
        long l = 1;
        long h = n; 
        
        while(l<=h) {
            long mid = l + (h-l)/2;
            long coins = mid*(mid+1)/2;
            System.out.println("The middle value is: " + mid);
            System.out.println("The number of coins are: " + coins);
            if(coins == n) {
                return (int)mid;
            } else if(coins < n) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return (int)h;
    }
}