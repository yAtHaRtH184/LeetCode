// class Solution {
//     public int firstUniqChar(String s) {
//         HashMap<Character, Integer> mp=new HashMap<>();
//         int n=s.length();
//         for(int i=0; i<n; i++){
//             char ch=s.charAt(i);
//             mp.put(ch, mp.getOrDefault(ch, 0)+1);
//         }
//         for(int i=0; i<n; i++){
//             if(mp.get(s.charAt(i))==1){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
class Solution {
    public int firstUniqChar(String s) {
        int[] arr=new int[26];
        int n=s.length();
        for(int i=0; i<n; i++){
            int c=s.charAt(i)-'a';
            arr[c]++;
        }
        for(int i=0; i<n; i++){
            int c=s.charAt(i)-'a';
            if(arr[c]==1){
                return i;
            }
        }
        return -1;
    }
}