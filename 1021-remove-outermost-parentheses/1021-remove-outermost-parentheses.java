class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        if(n<=2 )return "";
        StringBuilder res=new StringBuilder();
        int count=0;
        for(int i=0; i<n ; i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
                if(count>1){
                res.append(ch);
            }
            }
            else if(ch==')'){
                count--;
                if(count>0){
                    res.append(ch);
                }
            }
            
        }
        return res.toString();
    }
}