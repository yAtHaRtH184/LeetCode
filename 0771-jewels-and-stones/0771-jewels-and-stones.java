// class Solution {
//     public int numJewelsInStones(String jewels, String stones) {
//         int n1=stones.length();
//         int n2=jewels.length();
//         HashMap<Character, Integer> mp=new HashMap<>();
//         for(int i=0; i<n1; i++){
//             char ch=stones.charAt(i);
//             mp.put(ch, mp.getOrDefault(ch, 0)+1);
//         }
//         int count=0;
//         for(int i=0; i<n2; i++){
//             char ch=jewels.charAt(i);
//             if(mp.containsKey(ch))count+=mp.get(ch);
//         }
//         return count;
//     }
// }

class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int count = 0;

        for (char ch : stones.toCharArray()) {
            if (jewels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }
}