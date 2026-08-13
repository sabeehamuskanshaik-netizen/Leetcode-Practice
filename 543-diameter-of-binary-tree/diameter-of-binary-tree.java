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
    int ans=0;
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lefty=height(root.left);
        int righty=height(root.right);
        ans=Math.max(lefty+righty,ans);
        return (Math.max(lefty,righty)+1);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;  
    }
}