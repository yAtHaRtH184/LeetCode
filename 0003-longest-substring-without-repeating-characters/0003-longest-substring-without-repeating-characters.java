// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n=s.length();
//         int l=0;
//         int len=0;
//         Set<Character> set=new LinkedHashSet<>();
//         for(int r=0; r<n; r++){
//             char ch=s.charAt(r);

//             while(set.contains(ch)){
//                 set.remove(s.charAt(l));
//                 l++;
//             }
//             set.add(ch);
//             len=Math.max(len, r-l+1);
//         }
//         return len;
//     }
// }
// class Solution {
//     public int lengthOfLongestSubstring(String s) {

//         HashMap<Character, Integer> mp=new HashMap<>();
//         int ans=0;
//         int l=0;
//         int n=s.length();
//         for(int r=0; r<n; r++){
//             char ch=s.charAt(r);
//             if(mp.containsKey(ch)){
//                 l=Math.max(l, mp.get(ch)+1);
//             }
//             mp.put(ch,r);
//             ans=Math.max(ans, r-l+1);
//         }
//         return ans;
//     }
// }
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] last=new int[128];
        Arrays.fill(last,-1);
        int ans=0;
        int l=0;
        int n=s.length();
        for(int r=0; r<n; r++){
            char ch=s.charAt(r);
            if(last[ch]>=l){
                l=last[ch]+1;
            }
            last[ch]=r;
            ans=Math.max(ans, r-l+1);
        }
        return ans;
    }
}