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
    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(0,nums.length-1,nums);
    }
    
    private TreeNode bst(int from,int to,int[] num){
        if(from>to)
            return null;
        if(from<0||to<0||from>=num.length||to>=num.length)
            return null;
        if(from==to)
            return new TreeNode(num[from]);
        int mid=(from+to)/2;
        TreeNode node=new TreeNode(num[mid]);
        node.left=bst(from,mid-1,num);
        node.right=bst(mid+1,to,num);
        return node;
    }
}
