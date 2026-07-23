class Solution {
    // public boolean backspaceCompare(String s, String t) {
    //     int n1=s.length();
    //     int n2=t.length();
        
    //     Deque<Character> stk1=new ArrayDeque<>();
    //     for(int i=0; i<n1; i++){
    //         char ch=s.charAt(i);
    //         if(ch!='#'){
    //             stk1.push(ch);
    //         }
    //         else{
    //             if(!stk1.isEmpty())stk1.pop();
    //         }
    //     }

    //     Deque<Character> stk2=new ArrayDeque<>();
    //     for(int i=0; i<n2; i++){
    //         char ch=t.charAt(i);
    //         if(ch!='#'){
    //             stk2.push(ch);
    //         }
    //         else{
    //             if(!stk2.isEmpty())stk2.pop();
    //         }
    //     }

    //     if(stk1.size()!=stk2.size())return false;
    //     while(!stk1.isEmpty()){
    //         char c1=stk1.pop();
    //         char c2=stk2.pop();
    //         if(c1!=c2){
    //             return false;
    //         }
    //     }
    //     return true;

    // }


    // public boolean backspaceCompare(String s, String t) {
    //     int n1=s.length();
    //     int n2=t.length();
        
    //     StringBuilder sb1=new StringBuilder();
    //     StringBuilder sb2=new StringBuilder();

    //     for(int i=0; i<n1; i++){
    //         char ch=s.charAt(i);
    //         if(ch!='#'){
    //             sb1.append(ch);
    //         }
    //         else{
    //             if(sb1.length()>0)sb1.deleteCharAt(sb1.length() - 1);
    //         }
    //     }
    //     for(int i=0; i<n2; i++){
    //         char ch=t.charAt(i);
    //         if(ch!='#'){
    //             sb2.append(ch);
    //         }
    //         else{
    //             if(sb2.length()>0)sb2.deleteCharAt(sb2.length()-1);
    //         }
    //     }
    //     return sb1.toString().equals(sb2.toString());
        
    // }

    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;
        
        while(i>=0 || j>=0){
            int skip1=0;
            while(i>=0){
                if(s.charAt(i)=='#'){
                    skip1++;
                    i--;
                }
                else if(skip1>0){
                    skip1--;
                    i--;
                }
                else{
                    break;
                }
            }
            int skip2=0;
            while(j>=0){
                if(t.charAt(j)=='#'){
                    skip2++;
                    j--;
                }
                else if(skip2>0){
                    skip2--;
                    j--;
                }
                else{
                    break;
                }
            }

            if(i>=0 && j>=0){
                if(s.charAt(i)!=t.charAt(j)){
                    return false;
                }
            }
            else if(i>=0 || j>=0){
                return false;
            }
            i--;
            j--;

        }
        return true;
        
    }
}