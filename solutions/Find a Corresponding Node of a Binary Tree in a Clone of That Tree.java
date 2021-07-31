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
    public final TreeNode getTargetCopy(final TreeNode original, final 
        TreeNode cloned, final TreeNode target) {
        if(original==null)
            return null;
        Queue<TreeNode> q1=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();
        q1.add(original);
        q2.add(cloned);
        
        while(!q1.isEmpty()){
            TreeNode tn1=q1.poll();
            TreeNode tn2=q2.poll();
            if(tn1.val==target.val)
                return tn2;
            else{
                if(tn1.left!=null){
                    q1.add(tn1.left);
                    q2.add(tn2.left);
                }
                if(tn1.right!=null){
                    q1.add(tn1.right);
                    q2.add(tn2.right);
                }   
            }
        }
        return null;
        
    }
}
