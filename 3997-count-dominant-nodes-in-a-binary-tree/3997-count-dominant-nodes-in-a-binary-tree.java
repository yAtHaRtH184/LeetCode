/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int c=0;
    public int count(TreeNode root ){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            c++;
            return root.val;
        }
        int left=count(root.left );
        int right=count(root.right);
        int max=Math.max(left, right);
        if(root.val>=max){
            c++;
            return root.val;
        }
        return max;
    }
    public int countDominantNodes(TreeNode root) {
        count(root);
        return c;
    }
}