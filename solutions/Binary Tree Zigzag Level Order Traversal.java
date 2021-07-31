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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return Collections.emptyList();
        }
        Queue<TreeNode> q = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        List<List<Integer>> list = new ArrayList<>();
        boolean rev = false;
        q.add(root);
        List<Integer> temp = new ArrayList<>();
        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                TreeNode tn = q.remove();
                if (rev)
                    stack.add(tn);
                else
                    temp.add(tn.val);
                if (tn.left != null)
                    q.add(tn.left);
                if (tn.right != null)
                    q.add(tn.right);
                size--;
            }
            while (!stack.isEmpty())
                temp.add(stack.pop().val);
            list.add(temp);
            temp=new ArrayList<>();
            rev = !rev;
        }
        return list;
    }
}
