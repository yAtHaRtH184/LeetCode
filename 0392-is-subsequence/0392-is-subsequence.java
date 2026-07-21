class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1=s.length();
        int n2=t.length();
    
        if(n1>n2)return false;
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            char ch1=s.charAt(i);
            char ch2=t.charAt(j);
    
            if(ch1!=ch2){
                j++;           
            } 
            else{
                i++;
                j++;
            }  
        }
        if(i==n1)return true;
        return false;
    }
}