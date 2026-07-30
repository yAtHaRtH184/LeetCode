class Solution {
    
    public int minimumPushes(String word) {
       int n=word.length();
       if(n<=8)return n;
       int res=0;
       int i=1;
       while(n>7){
        res+=i*8;
        i++;
        n-=8;
       }
       if(n>0){
        res+=i*n;
       }
       return res;
    }
}