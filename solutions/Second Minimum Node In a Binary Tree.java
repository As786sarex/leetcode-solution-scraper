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
    private long first=Long.MAX_VALUE;
    private long second=Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        doDfs(root);
        return second==Long.MAX_VALUE?-1: (int) second;
    }
    
    private void doDfs(TreeNode node){
        if(node==null)
            return;
        else{
            if(node.val<first){
                if(first!=Long.MAX_VALUE){
                    second=first;
                    first=node.val;
                }
                else{
                    first=node.val;
                }
            }
            else if(node.val<second){
                if(first!=node.val)
                    second=node.val;
            }
            doDfs(node.left);
            doDfs(node.right);
        }
    }
}
