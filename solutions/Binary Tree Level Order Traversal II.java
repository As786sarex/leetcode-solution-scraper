/**
 * Definition for a binary tree node.
 *  * public class TreeNode {
 *     int val;
 *      *     TreeNode left;
 *     TreeNode right;
 *      *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *      *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *          *         this.left = left;
 *         this.right = right;
 *          *     }
 * }
 *  */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
      List<List<Integer>> res=new ArrayList<>();
      if(root==null)
          return res;
      Queue<TreeNode> q=new LinkedList<>();
      q.add(root);
      List<Integer> temp=new ArrayList<>();
      int curr=1;
      while(!q.isEmpty()){
         TreeNode n=q.poll();
         temp.add(n.val);
         --curr;
         if(n.left!=null)
              q.add(n.left);
         if(n.right!=null)
              q.add(n.right);
         if(curr==0){
            curr=q.size();
            res.add(temp);
            temp=new ArrayList<>();
         }
      }
        int upto=res.size()/2;
      for(int i=0;i<upto;++i){
          int right=res.size()-i-1;
          var t=res.get(i);
          res.set(i,res.get(right));
          res.set(right,t);
      }
      return res;
    }
    }
