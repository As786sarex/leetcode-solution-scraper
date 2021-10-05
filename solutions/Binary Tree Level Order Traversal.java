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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return Collections.emptyList();
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        q.add(root);
        q.add(null);
        List<Integer> temp = new ArrayList<>();
        while (!q.isEmpty()) {
            TreeNode tn = q.poll();
            if (tn == null) {
                list.add(temp);
                temp = new ArrayList<>();
                if (!q.isEmpty())
                    q.add(null);
            } else {
                temp.add(tn.val);
                if (tn.left != null)
                    q.add(tn.left);
                if (tn.right != null)
                    q.add(tn.right);
            }
        }
        return list;
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return Collections.emptyList();
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        q.add(root);
        q.add(null);
        List<Integer> temp = new ArrayList<>();
        while (!q.isEmpty()) {
            TreeNode tn = q.poll();
            if (tn == null) {
                list.add(temp);
                temp = new ArrayList<>();
                if (!q.isEmpty())
                    q.add(null);
            } else {
                temp.add(tn.val);
                if (tn.left != null)
                    q.add(tn.left);
                if (tn.right != null)
                    q.add(tn.right);
            }
        }
        return list;
    }
}
