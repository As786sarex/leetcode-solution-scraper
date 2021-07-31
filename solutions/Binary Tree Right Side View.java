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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)
            return Collections.emptyList();
        List<Integer> l=new LinkedList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int curr=1;
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            --curr;
            if(curr==0)
                l.add(node.val);
            if(node.left!=null)
                q.add(node.left);
            if(node.right!=null)
                q.add(node.right);
            if(curr==0)
                curr=q.size();
        }
        return l;
    }
}
