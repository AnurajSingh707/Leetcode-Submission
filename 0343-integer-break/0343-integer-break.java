class Solution {
    int dp[];
    public static int help(int n , int dp[]){
        if( n == 2){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int res = Integer.MIN_VALUE;
        for(int i = 1; i <n-1;i++){
    int prod = i * Math.max(n-i,help(n-i,dp));
      res = Math.max(res, prod);
        }
        return dp[n] =  res; 
    }
    public int integerBreak(int n) {
        dp = new int[n+1];

        for(int i = 0; i<n;i++){
            Arrays.fill(dp, -1);
        }
        return help(n, dp);
    }
}