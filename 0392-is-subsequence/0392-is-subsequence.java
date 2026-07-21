// class Solution {
//     public boolean isSubsequence(String s, String t) {
//         int n1=s.length();
//         int n2=t.length();
    
//         if(n1>n2)return false;
//         int i=0;
//         int j=0;
//         while(i<n1 && j<n2){
//             char ch1=s.charAt(i);
//             char ch2=t.charAt(j);
    
//             if(ch1!=ch2){
//                 j++;           
//             } 
//             else{
//                 i++;
//                 j++;
//             }  
//         }
//         if(i==n1)return true;
//         return false;
//     }
// }

class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        if(s.isEmpty())return true;
        int last=0;
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            int found=t.indexOf(ch, last);
            if(found==-1)return false;
            last=found+1;
        }
        return true;
    }
    
}