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
    private TreeNode left,mid,right,prev;
    public void recoverTree(TreeNode root) {
        inorder(root);
        if(left!=null&&right!=null){
            int temp=left.val;
            left.val=right.val;
            right.val=temp;
        } else if(mid!=null){
            int temp=left.val;
            left.val=mid.val;
            mid.val=temp;
        }
    }
    
    private void inorder(TreeNode node){
        if(left!=null&&right!=null)
            return;
        if(node.left!=null)
            inorder(node.left);
        
        if(left==null&&prev!=null&&prev.val>node.val){
            left=prev;
            mid=node;
        } else if(right==null&&prev!=null&&prev.val>node.val){
            right=node;
        }
        prev=node;
        if(node.right!=null)
            inorder(node.right);
    }
}
