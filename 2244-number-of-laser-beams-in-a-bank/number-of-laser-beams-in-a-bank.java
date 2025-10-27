class Solution {
    public int numberOfBeams(String[] bank) {
        int count = 0;
        int prev = 0;

        for(String floor:bank) {
            int countDevice = 0;
            for(int i=0;i<floor.length();i++) {
                if(floor.charAt(i) == '1') {
                    countDevice++;
                }
            }

            count += countDevice*prev;

            prev = countDevice > 0 ? countDevice : prev;
        }

        return count;
    }
}