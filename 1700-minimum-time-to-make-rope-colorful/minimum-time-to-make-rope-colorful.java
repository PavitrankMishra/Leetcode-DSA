class Solution { 
    public int minCost(String colors, int[] neededTime) {
        int total_Time = 0;
        int prev_max = neededTime[0];
        for(int i=1;i<colors.length();i++) {
                if(colors.charAt(i) == colors.charAt(i-1)) {
                    total_Time += Math.min(prev_max, neededTime[i]);
                    prev_max = Math.max(prev_max, neededTime[i]);
                } else {
                    prev_max = neededTime[i];
                }
                System.out.println(total_Time);  
        }
        return total_Time;
    }
}