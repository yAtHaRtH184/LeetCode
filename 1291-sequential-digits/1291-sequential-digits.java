class Solution {
    public void helper(int curr, int nxt, int low, int high, List<Integer>ans){
        if(curr>=low &&  curr<=high){
            ans.add(curr);
        }

        if(nxt>9){
            return;
        }
        curr=curr*10+nxt;
        helper(curr, nxt+1, low, high, ans);
    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1; i<=9; i++){
            List<Integer> in=new ArrayList<>();
            helper(i, i+1, low, high, in);
            ans.addAll(in);
        }
        Collections.sort(ans);
        return ans;
    }
}