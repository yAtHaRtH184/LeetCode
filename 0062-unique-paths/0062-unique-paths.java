class Solution {
// recursive
    // int count=0;
    // public void helper(int m, int n ){
    //     if(m==0 && n==0){
    //         count++;
    //     }
        
    //     if(m>0){
    //         helper(m-1, n);
    //     }
    //     if(n>0){
    //         helper(m, n-1);
    //     }
    // }
    // public int uniquePaths(int m, int n) {
    //     helper(m-1, n-1);
    //         return count;
    // }    

// memoisation   
    // public int helper(int m, int n , int[][]dp){
    //     if(m==0 && n==0){
    //         return 1;
    //     }
    //     if(dp[m][n]!=-1){
    //         return dp[m][n];
    //     }
    //     int up=0;
    //     int left=0;
    //     if(m>0){up=helper(m-1, n, dp);}
    //     if(n>0){left=helper(m, n-1, dp);}
    //     dp[m][n]=up+left;
    //     return dp[m][n];
    // }
    // public int uniquePaths(int m, int n) {
    //     int[][] dp=new int[m][n];
    //     for(int[] row:dp){
    //         Arrays.fill(row, -1);
    //     }
        
    //     return helper(m-1, n-1, dp);
    // }  

// tabulation
   
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        dp[0][0]=1;
        for(int i=1; i<m; i++){
            dp[i][0]=1;
        }
        for(int j=1; j<n; j++){
            dp[0][j]=1;
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }  
}