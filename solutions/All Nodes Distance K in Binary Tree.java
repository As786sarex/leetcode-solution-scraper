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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        if(K==0)
            return Arrays.asList(target.val);
        Map<Integer,TreeNode> parents=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        K-=1;
        List<Integer> list=null;
        parents.put(root.val,null);
        getParents(parents,root);
        Queue<TreeNode> q=new LinkedList<>();
        q.add(target);
        int curr=1,level=0;
        while(!q.isEmpty()){
            TreeNode n=q.poll();
            set.add(n.val);
            --curr;
            if(n.left!=null&&!set.contains(n.left.val))
                q.add(n.left);
            if(n.right!=null&&!set.contains(n.right.val))
                q.add(n.right);
            TreeNode parent=parents.getOrDefault(n.val,null);
            if(parent!=null&&!set.contains(parent.val))
                q.add(parent);
            if(level==K&&curr==0){
                list=new LinkedList();
                while(!q.isEmpty()){
                    list.add(q.poll().val);
                }
                return list;
            }
            else if(curr==0) {
                ++level;
                curr=q.size();
            }
        }
        return new ArrayList<>();
    }
    
    private void getParents(Map<Integer,TreeNode> parents,TreeNode node) {
        if(node.left!=null){
            parents.put(node.left.val,node);
            getParents(parents,node.left);
        }
        if(node.right!=null){
            parents.put(node.right.val,node);
            getParents(parents,node.right);
        }
    }
}
