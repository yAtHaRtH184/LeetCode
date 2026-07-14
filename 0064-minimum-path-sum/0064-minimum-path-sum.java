class Solution {
// recursion
    // public int helper(int[][] grid, int m , int n){
    //     if(m==0 && n==0){
    //         return grid[0][0];
    //     }
        
    //     int up=Integer.MAX_VALUE;
    //     int left=Integer.MAX_VALUE;
    //     if(m>0)up=grid[m][n]+helper(grid, m-1, n);
    //     if(n>0)left=grid[m][n]+helper(grid, m , n-1);
    //     return Math.min(up,left);
    // }
    // public int minPathSum(int[][] grid) {
    //     int m=grid.length; 
    //     int n=grid[0].length;
    //     return helper(grid , m-1, n-1);
    // }


// memoisation
    // public int helper(int[][] grid, int m , int n, int[][] dp){
    //     if(m==0 && n==0){
    //         return grid[0][0];
    //     }
        
    //     if(dp[m][n]!=-1){
    //         return dp[m][n];
    //     }
    //     int up=Integer.MAX_VALUE;
    //     int left=Integer.MAX_VALUE;
    //     if(m>0)up=grid[m][n]+helper(grid, m-1, n, dp);
    //     if(n>0)left=grid[m][n]+helper(grid, m , n-1, dp);
    //     dp[m][n]= Math.min(up,left);
    //     return dp[m][n];
    // }
    // public int minPathSum(int[][] grid) {
    //     int m=grid.length; 
    //     int n=grid[0].length;
    //     int[][] dp=new int[m][n];
    //     for(int[] row: dp){
    //         Arrays.fill(row,-1);
    //     }
    //     return helper(grid , m-1, n-1, dp);
    // }

// Tabulation
    // public int minPathSum(int[][] grid) {
    //     int m=grid.length; 
    //     int n=grid[0].length;
    //     int[][] dp=new int[m][n];
    //     dp[0][0]=grid[0][0];
    //     for(int i=1; i<m; i++){
    //         dp[i][0]=dp[i-1][0]+grid[i][0];
    //     }
    //     for(int j=1; j<n; j++){
    //         dp[0][j]=dp[0][j-1]+grid[0][j];
    //     }
    //     for(int i=1; i<m; i++){
    //         for(int j=1; j<n; j++){
    //             int down=grid[i][j]+dp[i-1][j];
    //             int right=grid[i][j]+dp[i][j-1];

    //             dp[i][j]=Math.min(down ,right);
    //         }
    //     }
    //     return dp[m-1][n-1];
    // }

// Space optimsation
    // public int minPathSum(int[][] grid) {
    //     int m=grid.length; 
    //     int n=grid[0].length;
    //     int[]prev=new int[n];
    //     prev[0]=grid[0][0];
    //     for(int j=1; j<n; j++){
    //         prev[j]=prev[j-1]+grid[0][j];
    //     }
    //     for(int i=1; i<m; i++){
    //         int[] temp=new int[n];
    //         temp[0]=prev[0]+grid[i][0];
    //         for(int j=1; j<n; j++){
    //             temp[j]=Math.min(prev[j] ,temp[j-1])+grid[i][j];
    //         }
    //         prev=temp;
    //     }
    //     return prev[n-1];
    // }

// best
    public int minPathSum(int[][] grid) {
        int m=grid.length; 
        int n=grid[0].length;
        int[]prev=new int[n];
        prev[0]=grid[0][0];
        for(int j=1; j<n; j++){
            prev[j]=prev[j-1]+grid[0][j];
        }
        for(int i=1; i<m; i++){
            prev[0]=prev[0]+grid[i][0];
            for(int j=1; j<n; j++){
                prev[j]=Math.min(prev[j] ,prev[j-1])+grid[i][j];
            }
        }
        return prev[n-1];
    }
}