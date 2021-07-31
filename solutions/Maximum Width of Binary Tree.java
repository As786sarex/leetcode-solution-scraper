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
    int gMax=1;
    public int widthOfBinaryTree(TreeNode root) {
        List<Integer> levels=new ArrayList<>();
        preorder(root,levels,1,1);
        return gMax;
        
    }
    
    private void preorder(TreeNode node,List<Integer> dp,int currLevel,int 
        offset){
        if(node==null)
            return;
        if(currLevel>dp.size()){
            dp.add(offset);
        } else {
            gMax=Integer.max(gMax,((int)Math.abs(offset-dp.get(currLevel-1)+1
                )));
        }
        if(node.left!=null)
            preorder(node.left,dp,currLevel+1,2*offset);
                             
        if(node.right!=null)
            preorder(node.right,dp,currLevel+1,2*offset+1);
    }
}
