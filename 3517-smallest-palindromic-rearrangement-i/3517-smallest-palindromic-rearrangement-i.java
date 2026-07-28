class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder res=new StringBuilder();
        char extra=' ';
        for(int  i=0; i<26; i++){
            char ch=(char)(i+'a');
            int val=freq[i];
            if(val%2!=0){
                extra=ch;
                val-=1;
            }
            for(int j=0; j<val/2; j++){
                res.append(ch);
            }
        }
        StringBuilder rev=new StringBuilder(res).reverse();
        if(extra!=' ')res.append(extra);
        res.append(rev);
        return res.toString();
    }
}