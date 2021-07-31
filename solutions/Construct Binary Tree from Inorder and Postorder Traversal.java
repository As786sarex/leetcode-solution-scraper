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
    int index=0;
    private Map<Integer,Integer> mp;
    public TreeNode buildTree(int[] inorder, int[] postOrder) {
        mp=new HashMap<>();
        index=postOrder.length-1;
        for(int i=0;i<inorder.length;++i)
            mp.put(inorder[i],i);
        return construct(0,inorder.length-1,postOrder[index],inorder,postOrder
            );
    }
    
    private TreeNode construct(int start,int end,int node, int[] inorder,int[] 
        postOrder){
        if(start==end)
            return new TreeNode(inorder[start]);
        int pivot=mp.get(postOrder[index]);
        TreeNode n=new TreeNode(inorder[pivot]);
        
        if((pivot+1)<=end)
            n.right=construct(pivot+1,end,--index,inorder,postOrder);
        if(start<=pivot-1)
            n.left=construct(start,pivot-1,--index,inorder,postOrder);
        return n;
    }
}
