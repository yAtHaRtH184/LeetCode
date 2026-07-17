class Solution {
    public int binary(int[] arr, int k, int low, int high){
        if(low>high){
            return low;
        }
        int mid=low+(high-low)/2;
        int miss=arr[mid]-(mid+1);
        if(miss>=k){
            return binary(arr, k, low, mid-1);
        }
        else {
            return binary(arr, k, mid+1, high);
        }
        
    }

    public int findKthPositive(int[] arr, int k) {
        
        int n=arr.length;
        int min=binary(arr, k, 0, n-1);
        if (min == 0) {
            return k;
        }
        int miss=arr[min-1]-(min);
        int req=k-miss;
        return req+arr[min-1];
    }

    // public int findKthPositive(int[] arr, int k) {
    //     int n=arr.length;
        // int z=1;
        // int i=0;
        // while(i<n ){
        //     int x=arr[i];
        //     if(z==arr[i]){
        //         i++;
        //     }
        //     else if(arr[i]>z){
        //         if(k==1){
        //             return z;
        //         }
        //         k--;
        //     }
        //     z++;
        // }
        // while(k!=1){
        //     z++;
        //     k--;
        // }
        // return z;


    // }
}