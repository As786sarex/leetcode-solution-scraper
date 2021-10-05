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

    
    private int max=0;
    public TreeNode bstToGst(TreeNode root) {
        if(root==null)
            return root;
        reverseInorder(root);
        return root;
    }
    
    private void reverseInorder(TreeNode node){
        if(node.right!=null)
            reverseInorder(node.right);
        max+=node.val;
        node.val=max;
        if(node.left!=null)
            reverseInorder(node.left);
    } 
}
