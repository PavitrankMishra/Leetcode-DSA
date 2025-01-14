class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int [] freq = new int [n+1];
        int counter = 0;
        int[] c = new int [n];

        for(int i=0;i<n;i++) {
            freq[A[i]]++;
            if(freq[A[i]] == 2) {
                counter++;
            }

            freq[B[i]]++;
            if(freq[B[i]] == 2) {
                counter++;
            }

            c[i] = counter;
        }
        return c;
    }
}