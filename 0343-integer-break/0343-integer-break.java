class Solution {
    public int integerBreak(int n) {
        int dp[] = new int[n+1];
        dp[2] = 1;
        for(int j = 3; j<= n;j++){
            int res = Integer.MIN_VALUE;
            for (int i =1; i<j; i++){
                int prod = i * Math.max(j-i, dp[j-i]);
                res = Math.max(res, prod);
            }
             dp[j] = res;
        }
        return dp[n];
    }
}