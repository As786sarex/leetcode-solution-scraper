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
    
    int result=0,k=0;
    public int kthSmallest(TreeNode root, int k) {
        this.k=k;
        inorder(root);
        return result;
    }
    
    private void inorder(TreeNode node){
        if(k<=0)
            return;
        if(node==null)
            return;
        inorder(node.left);
        --k;
        if(k==0){
            result=node.val;
            return;
        }
        inorder(node.right);
    }
    
}
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
    
    int result=0,k=0;
    public int kthSmallest(TreeNode root, int k) {
        this.k=k;
        inorder(root);
        return result;
    }
    
    private void inorder(TreeNode node){
        if(k<=0)
            return;
        if(node==null)
            return;
        inorder(node.left);
        --k;
        if(k==0){
            result=node.val;
            return;
        }
        inorder(node.right);
    }
    
}
