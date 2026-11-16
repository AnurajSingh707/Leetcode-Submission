
class Solution {
    public int deleteAndEarn(int[] nums) {

        int max = 0;

        for(int x : nums){
            max = Math.max(max, x);
        }

        int points[] = new int[max + 1];

        for(int x : nums){
            points[x] += x;
        }

        int dp[] = new int[max + 1];

        dp[0] = points[0];

        if(max >= 1){
            dp[1] = Math.max(points[0], points[1]);
        }

        for(int i = 2; i <= max; i++){

            int pick = points[i] + dp[i-2];

            int nonPick = dp[i-1];

            dp[i] = Math.max(pick, nonPick);
        }

        return dp[max];
    }
}
