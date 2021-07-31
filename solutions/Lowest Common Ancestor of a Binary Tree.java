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
    private boolean flag=false;
    private TreeNode result=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q
        ) {
        postOrder(root,p.val,q.val);
        return result;
    }
    
    private int postOrder(TreeNode node,int p,int q){
        if(flag)
            return 0;
        if(node==null)
            return 0;
        int temp=0;
        if(node.left!=null)
            temp+=postOrder(node.left,p,q);
        if(node.right!=null)
            temp+=postOrder(node.right,p,q);
        if(node.val==p||node.val==q)
            temp+=1;
        if(!flag&&temp>=2){
            flag=true;
            result=node;
        }
        
        return temp;
    }
}
