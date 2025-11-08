class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int h = letters.length-1;

        while(l<=h) {
            int mid = l + (h-l)/2;
            System.out.println("The middle character is: " + letters[mid]);
            System.out.println("The value of middle letters: " + (int)letters[mid]);
            System.out.println("The value of target letters is: " + (int)target);
            if(letters[mid] <= target) {
                l = mid + 1;
            } else if(letters[mid]  > target) {
                h = mid - 1;
            }
        }
        return letters[l % letters.length];  
    }
}