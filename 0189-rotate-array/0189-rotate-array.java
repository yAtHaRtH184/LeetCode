class Solution {
    public void reverse(int[]nums, int i , int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j--;
            i++;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k , n-1);
    }
}
// this will exceed the time limit
        // int rem=k%n;
        // for(int i=0; i<k; i++){
        //     int temp=nums[n-1];
        //     for(int j=n-1; j>0; j--){
        //         nums[j]=nums[j-1];
        //     }
        //     nums[0]=temp;
        // }