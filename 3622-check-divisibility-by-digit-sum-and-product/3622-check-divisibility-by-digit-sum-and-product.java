class Solution {
    public boolean checkDivisibility(int n) {
        int k=n;
        int sum=0;
        int prod=1;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }
        int add=sum+prod;
        int res=k%add;
        if(res==0)return true;
        else return false;
    }
}