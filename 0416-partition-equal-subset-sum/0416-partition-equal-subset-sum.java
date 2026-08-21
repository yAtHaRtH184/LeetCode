class Solution {
// memoisation
    // public boolean subsetSum(int[] nums,int idx,  int target, int[][]dp){
    //     if(target==0){
    //         return true;
    //     }
    //     if(idx==0){
    //         return nums[idx]==target;
    //     }
    //     if(dp[idx][target]!=-1)return dp[idx][target]==1; 
    //     boolean nottake=subsetSum(nums, idx-1, target, dp);
    //     boolean take=false;
    //     if(target>=nums[idx]){
    //         take=subsetSum(nums, idx-1, target- nums[idx], dp);
    //     }
    //     dp[idx][target]=(take || nottake)?1:0;
    //     return take || nottake;
    // }
    // public boolean canPartition(int[] nums) {
    //     int n=nums.length;
    //     int target=0;
    //     for(int i=0; i<n; i++){
    //         target+=nums[i];
    //     }
    //     if(target%2!=0)return false;
    //     int[][] dp= new int[n][target/2+1];
    //     for(int[] row: dp){
    //         Arrays.fill(row, -1);
    //     }
    //     return subsetSum(nums, n-1, target/2, dp);

    // }

//tabulation
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int target=0;
        for(int i=0; i<n; i++){
            target+=nums[i];
        }
        if(target%2!=0)return false;
        target/=2;
        boolean[] prev=new boolean[target+1];
        prev[0]=true;
        
        if(nums[0]<=target){
            prev[nums[0]]=true;
        }
        for(int ind=1; ind<n; ind++){
            boolean[] temp=new boolean[target+1];
            temp[0]=true; 
            for(int k=1; k<=target; k++){
                boolean nottake=prev[k];
                boolean take=false;
                if(k>=nums[ind]){
                    take=prev[k-nums[ind]];
                }
                temp[k]=(take || nottake);
            }
            prev=temp;
        }
        return prev[target];

    }
}