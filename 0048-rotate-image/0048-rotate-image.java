class Solution {
    public void rotate(int[][] matrix) {
       
        int n = matrix.length;
        int m = matrix[0].length;
         int dp[][] = new int[n][m];
        for(int i = 0; i<n;i++){
            for(int j = 0; j<m; j++ ){
                dp[j][n-1-i] = matrix[i][j];
            }
        }
        for(int  i = 0; i<n;i++){
            for(int j = 0; j<m;j++){
                matrix[i][j] = dp[i][j];
            }
        }
        
    }
}