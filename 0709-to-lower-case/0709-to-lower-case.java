class Solution {
    public String toLowerCase(String s) {
        int n=s.length();
        String res="";
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                res+=(char)(ch-'A'+'a');
            }
            else{
                res+=ch;
            }   
        }
        return res;
    }
}