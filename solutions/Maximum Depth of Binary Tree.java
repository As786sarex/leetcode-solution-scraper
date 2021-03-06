/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        else{
            int left=maxDepth(root.left)+1;
            int right=maxDepth(root.right)+1;
            return Integer.max(left,right);
        }
        
    }
}
