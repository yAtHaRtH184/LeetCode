class Solution {
// recursion
    // public int min(int[] cost, int i){
    //     if(i==0 || i==1){
    //         return cost[i];
    //     }
    //     int left=cost[i]+min(cost, i-1);
    //     int right=cost[i]+min(cost, i-2);
    //     return Math.min(left, right);
    // }
    // public int minCostClimbingStairs(int[] cost) {
    //     return Math.min(min(cost, cost.length-1), min(cost, cost.length-2));
    // }

// memoisation
    // public int min(int[] cost, int i,int[] dp){
    //     if(i==0 || i==1){
    //         return cost[i];
    //     }
    //     if(dp[i]!=-1){
    //         return dp[i];
    //     }
    //     int left=cost[i]+min(cost, i-1, dp);
    //     int right=cost[i]+min(cost, i-2, dp);
    //     dp[i]= Math.min(left, right);
    //     return dp[i];
    // }
    // public int minCostClimbingStairs(int[] cost) {
    //     int n=cost.length;
    //     int[] dp=new int[n+1];
    //     Arrays.fill(dp,-1);
    //     return Math.min(min(cost, n-1, dp), min(cost, n-2, dp));
    // }

// tabulation
    // public int minCostClimbingStairs(int[] cost) {
    //     int n=cost.length;
    //     int[] dp=new int[n];
    //     dp[0]=cost[0];
    //     dp[1]=cost[1];
    //     for(int i=2; i<n; i++){
    //         int left=cost[i]+dp[i-1];
    //         int right=cost[i]+dp[i-2];
    //         dp[i]= Math.min(left, right);
    //     }
    //     return Math.min(dp[n-1],dp[n-2]);
    // }

// Space optimisation
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int prev2=cost[0];
        int prev=cost[1];
        for(int i=2; i<n; i++){
            int left=cost[i]+prev;
            int right=cost[i]+prev2;
            prev2=prev;
            prev= Math.min(left, right);
        }
        return Math.min(prev, prev2);
    }
}
