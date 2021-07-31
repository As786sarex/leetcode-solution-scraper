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
    public TreeNode invertTree(TreeNode root) {
        dfs(root);
        return root;
    }
    
    private void dfs(TreeNode node){
        if(node==null)
            return;
        TreeNode temp=node.left;
        node.left=node.right;
        node.right=temp;
        if(node.left!=null)
            dfs(node.left);
        if(node.right!=null)
            dfs(node.right);
    }
}
