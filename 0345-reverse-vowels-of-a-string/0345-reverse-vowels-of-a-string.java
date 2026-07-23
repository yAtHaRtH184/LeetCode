class Solution {
    private boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }
    // public String reverseVowels(String s) {
    //     int i=0;
    //     int j=s.length()-1;
    //     StringBuilder sb=new StringBuilder(s);
    //     while(i<j){
    //         char c1=sb.charAt(i);
    //         char c2=sb.charAt(j);
    //         if(isVowel(c1) && isVowel(c2)){
    //             sb.setCharAt(i, c2);
    //             sb.setCharAt(j, c1);

    //             j--;
    //             i++;
    //         }
    //         else if(!isVowel(c1)){
    //             i++;
    //         }else{
    //             j--;
    //         }
    //     }
    //     return sb.toString();
    // }
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] arr=s.toCharArray();
        while(i<j){
            while(i<j && !isVowel(arr[i])){
                i++;
            }
            while(i<j && !isVowel(arr[j])){
                j--;
            }
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}