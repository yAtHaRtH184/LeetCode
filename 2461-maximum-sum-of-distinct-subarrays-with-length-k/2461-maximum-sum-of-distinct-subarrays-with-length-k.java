class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long sum=0;
        long max=sum;
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i=0; i<k; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
        }
        if(mp.size()==k){
            max=sum;
        }
        for(int i=k; i<n; i++){
            mp.put(nums[i-k], mp.getOrDefault(nums[i-k],0)-1);
            if(mp.get(nums[i-k])==0){
                mp.remove(nums[i-k]);
            }
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
            sum-=nums[i-k];
            if(mp.size()==k){
                max=Math.max(sum, max);
            }
        }
        return max;
    }
}