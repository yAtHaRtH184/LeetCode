class Solution {
// recursion
    // public int helper(int i, int j,List<List<Integer>> triangle, int n){
    //     if(i==n-1)return triangle.get(n-1).get(j);
    //     int down=triangle.get(i).get(j)+helper(i+1, j, triangle,n);
    //     int dia=triangle.get(i).get(j)+helper(i+1, j+1, triangle,n);
    //     return Math.min(down, dia);
    // }
    // public int minimumTotal(List<List<Integer>> triangle) {
    //     int n= triangle.size();
    //     return helper(0,0,triangle, n);
    // }

// memoisation
    // public int helper(int i, int j,List<List<Integer>> triangle, int n, int[][] dp){
    //     if(i==n-1)return triangle.get(n-1).get(j);
    //     if(dp[i][j]!=-1)return dp[i][j];
    //     int down=triangle.get(i).get(j)+helper(i+1, j, triangle,n, dp);
    //     int dia=triangle.get(i).get(j)+helper(i+1, j+1, triangle,n, dp);
    //     dp[i][j]= Math.min(down, dia);
    //     return dp[i][j];
    // }
    // public int minimumTotal(List<List<Integer>> triangle) {
    //     int n= triangle.size();
    //     int[][] dp=new int[n][n];
    //     for(int[] row:dp){
    //         Arrays.fill(row, -1);
    //     }
    //     return helper(0,0,triangle, n,dp);
    // }

// tabulation
    // public int minimumTotal(List<List<Integer>> triangle) {
    //     int n= triangle.size();
    //     int[][] dp=new int[n][n];
    //     for(int j=0; j<n; j++){
    //         dp[n-1][j]=triangle.get(n-1).get(j);
    //     }
    //     for(int i=n-2; i>=0; i--){
    //         for(int j=i; j>=0; j--){
    //             int down=triangle.get(i).get(j)+dp[i+1][j];
    //             int dia=triangle.get(i).get(j)+dp[i+1][j+1];
    //             dp[i][j]= Math.min(down, dia);
    //         }
    //     }
    //     return dp[0][0];
    // }

// Space optmised
        public int minimumTotal(List<List<Integer>> triangle) {
        int n= triangle.size();
        int[] last=new int[n];
        for(int j=0; j<n; j++){
            last[j]=triangle.get(n-1).get(j);
        }
        for(int i=n-2; i>=0; i--){
            int[] temp=new int[n];
            for(int j=i; j>=0; j--){

                temp[j]= triangle.get(i).get(j) + Math.min(last[j], last[j+1]);
            }
            last=temp;
        }
        return last[0];
    }
}