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
    private int c1h=0,c2h=0,c1r,c2r;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null){
            return false;
        }
        getHeight(root,root.val,x,0,true);
        getHeight(root,root.val,y,0,false);
        if((c1h==c2h)&&(c1r!=c2r))
            return true;
        else
            return false;
        
    }
    
    private void getHeight(TreeNode node,int root,int value,int height,boolean 
        type){
        if(node==null)
            return;
        if(node.val==value){
            if(type){
                c1h=height;
                c1r=root;
            }
            else {
                c2h=height;
                c2r=root;
            }
            return;
        }
        getHeight(node.left,node.val,value,height+1,type);
        getHeight(node.right,node.val,value,height+1,type);
        
            
            
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
    private int c1h=0,c2h=0,c1r,c2r;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null){
            return false;
        }
        getHeight(root,root.val,x,0,true);
        getHeight(root,root.val,y,0,false);
        if((c1h==c2h)&&(c1r!=c2r))
            return true;
        else
            return false;
        
    }
    
    private void getHeight(TreeNode node,int root,int value,int height,boolean 
        type){
        if(node==null)
            return;
        if(node.val==value){
            if(type){
                c1h=height;
                c1r=root;
            }
            else {
                c2h=height;
                c2r=root;
            }
            return;
        }
        getHeight(node.left,node.val,value,height+1,type);
        getHeight(node.right,node.val,value,height+1,type);
        
            
            
    }
}
