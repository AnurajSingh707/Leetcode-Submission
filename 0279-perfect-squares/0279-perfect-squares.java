class Solution {
    int dp[];
 public static int help(int n, int dp[]){
    if(n == 0){
        return 0;
    }
    if(dp[n] != -1){
        return dp[n];
    }
    int ans = Integer.MAX_VALUE;
   for(int i = 1; i*i <= n; i++){
   int rem  = n - i*i;
   int small = help(rem,dp); 

   ans = Math.min(ans, 1 + small); 
   }
      return  dp[n] = ans;       
    }
    public int numSquares(int n) {

        dp = new int[n +1];

        for( int i = 0; i< n; i++){
            Arrays.fill(dp, -1);
        }
         return help(n, dp);
    }
}