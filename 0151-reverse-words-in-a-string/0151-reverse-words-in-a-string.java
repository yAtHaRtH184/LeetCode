class Solution {
    // public String reverseWords(String s) {
    //     s=s.trim();
    //     int n=s.length();
    //     StringBuilder res=new StringBuilder();

    //     String[] str = s.split("\\s+");
    //     int n1=str.length;
    //     for(int i=n1-1; i>=0; i--){
    //         res.append(str[i]);
    //         if(i!=0) res.append(" ");
    //     }
    //     return res.toString();
    // }
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder sb=new StringBuilder(s).reverse();
        int n=sb.length();
        StringBuilder res=new StringBuilder();
        int i=0;
        while (i < n){
            while(i<n && sb.charAt(i)==' '){
                i++;
            }
            int start=i;
            while (i < n && sb.charAt(i) != ' ') {
                i++;
            }
            String word=sb.substring(start, i);
            StringBuilder temp=new StringBuilder(word);
            temp.reverse();
            if (res.length() > 0) {
                res.append(" ");
            }
            res.append(temp);
        }
        return res.toString();
    }
}