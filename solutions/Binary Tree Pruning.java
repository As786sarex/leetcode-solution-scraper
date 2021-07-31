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
    public TreeNode pruneTree(TreeNode root) {
        int res=postOrder(root);
        return res==0?null:root;
    }

   private int postOrder(TreeNode node){
       if(node==null)
           return 0;
       int left=postOrder(node.left);
       int right=postOrder(node.right);
       if(left==0)
           node.left=null;
       if(right==0)
           node.right=null;
       return left+right+(node.val==1?1:0);
   }
}
