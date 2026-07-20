class Solution {
    public boolean checkIfPangram(String sentence) {
        int n= sentence.length();
        if(n<26){
            return false;
        }
        int[] arr=new int[26];
        for(int i=0; i<n; i++){
            int ch=sentence.charAt(i)-'a';
            arr[ch]++;
        }
        for(int i=0; i<26; i++){
            if(arr[i]<1){
                return false;
            }
        }
        return true;
    }
}