class Solution {
    public int missingInteger(int[] arr) {
        int sum=arr[0];
        int n=arr.length;
        for(int i=1; i<n; i++){
            if(arr[i]==arr[i-1]+1){
                sum+=arr[i];
            }
            else{
                break;
            }
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(arr[i]);
        }
        int x=sum;
        while(set.contains(x)){
            x++;
        }
        return x;
    }
}