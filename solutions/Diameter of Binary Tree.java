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
    int maximum=0;
    public int diameterOfBinaryTree(TreeNode root) {
        maximum=0;
        int x=getHeight(root);
        return maximum;
    }
    private int getHeight(TreeNode root){
        if(root==null){
            return -1;
        }
        int lh=getHeight(root.left)+1;
        int rh=getHeight(root.right)+1;
        maximum=Integer.max(maximum,(lh+rh));
        return Integer.max(lh,rh);
    }
}
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
    int maximum=0;
    public int diameterOfBinaryTree(TreeNode root) {
        maximum=0;
        int x=getHeight(root);
        return maximum;
    }
    private int getHeight(TreeNode root){
        if(root==null){
            return -1;
        }
        int lh=getHeight(root.left)+1;
        int rh=getHeight(root.right)+1;
        maximum=Integer.max(maximum,(lh+rh));
        return Integer.max(lh,rh);
    }
}
