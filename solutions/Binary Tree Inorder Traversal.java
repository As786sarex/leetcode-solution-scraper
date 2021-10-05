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
    List<Integer> store;
    public List<Integer> inorderTraversal(TreeNode root) {
        store=new ArrayList<>();
        inOrder(root);
        return store;
    }
    
    void inOrder(TreeNode node){
        if(node==null){
            return; 
        }
        else{
            inOrder(node.left);
            store.add(node.val);
            inOrder(node.right);
        }
    }
}
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
    List<Integer> store;
    public List<Integer> inorderTraversal(TreeNode root) {
        store=new ArrayList<>();
        inOrder(root);
        return store;
    }
    
    void inOrder(TreeNode node){
        if(node==null){
            return; 
        }
        else{
            inOrder(node.left);
            store.add(node.val);
            inOrder(node.right);
        }
    }
}
