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
    public void flatten(TreeNode root) {
        if(root==null)
            return;
        flatten(root.left);
        flatten(root.right);
        TreeNode temp=root.right;
        if(root.left!=null&&root.right!=null){
            root.right=root.left;
            TreeNode t=root.right;
            while(t.right!=null)
                t=t.right;
            t.right=temp;
            root.left=null;
        }
        else if(root.left!=null){
            root.right=root.left;
            root.left=null;
        }
    }
}
