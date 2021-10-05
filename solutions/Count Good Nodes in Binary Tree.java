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
    private int count;
    public int goodNodes(TreeNode root) {
        count=0;
        getCount(root, Integer.MIN_VALUE);
        return count;
    }

    private void getCount(TreeNode node,int maxUpto){
    if(node==null)
        return;
    if(node.val>=maxUpto){
        maxUpto=node.val;
        ++this.count;
    }
    if(node.left!=null)
    getCount(node.left,maxUpto);
    if(node.right!=null)
    getCount(node.right,maxUpto);
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
    private int count;
    public int goodNodes(TreeNode root) {
        count=0;
        getCount(root, Integer.MIN_VALUE);
        return count;
    }

    private void getCount(TreeNode node,int maxUpto){
    if(node==null)
        return;
    if(node.val>=maxUpto){
        maxUpto=node.val;
        ++this.count;
    }
    if(node.left!=null)
    getCount(node.left,maxUpto);
    if(node.right!=null)
    getCount(node.right,maxUpto);
    }
}
