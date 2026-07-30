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
 import java.util.*;
class Solution {
    public int maxDepth(TreeNode root) {
       if(root==null){
       return 0; 
       }
       int leftTree=maxDepth(root.left);
       int rightTree=maxDepth(root.right);
       int ans=Math.max(leftTree,rightTree);
       return ans+1;
        
        
    }
}