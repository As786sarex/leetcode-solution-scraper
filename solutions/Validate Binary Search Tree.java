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
    ArrayList<Integer> store;
    public boolean isValidBST(TreeNode root) {
        store=new ArrayList<>();
        inOrder(root);
        for(int i=1;i<store.size();i++){
            if(store.get(i-1)>=store.get(i)){
                return false;
            }
        }
        return true;

    }
    
    void inOrder(TreeNode node){
        if(node==null)
            return;
        else{
            inOrder(node.left);
            store.add(node.val);
            inOrder(node.right);
        }
    }
}
