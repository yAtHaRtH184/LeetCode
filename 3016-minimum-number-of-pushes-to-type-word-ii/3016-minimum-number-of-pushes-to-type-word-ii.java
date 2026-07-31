class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int[] arr=new int[26];
        for(int i=0; i<n; i++){
            char ch=word.charAt(i);
            arr[ch-'a']++;
        }
        Arrays.sort(arr);
        int res=0;
        // int i=0;
        // int pres=1;
        for(int j=25; j>=0; j--){
            res+=arr[j]*((25-j)/8+1);
            // i++;
            // if(i%8==0){
            //     pres++;
            // }
        }
        return res;
        
    }
}