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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer,List<int[]>> vertical=new TreeMap<>();
        doDfs(vertical,root,0,0);
        List<List<Integer>> result=new ArrayList<>();
        Comparator<int[]> comparator=(a,b)->{
          if(a[1]==b[1])
              return a[0]-b[0];
          return a[1]-b[1];
        };
        for(List<int[]> arr:vertical.values()){
            Collections.sort(arr,comparator);
            List<Integer> temp=new ArrayList<>();
            for(int[] i:arr){
                temp.add(i[0]);
            }
            result.add(temp);
        }
        return result;
    }
    
    private void doDfs(Map<Integer,List<int[]>> vertical,TreeNode node,int 
        current,int level){
        if(!vertical.containsKey(current))
            vertical.put(current,new ArrayList<>());
        vertical.get(current).add(new int[]{node.val,level});
        
        if(node.left!=null)
            doDfs(vertical,node.left,current-1,level+1);
        
        if(node.right!=null)
            doDfs(vertical,node.right,current+1,level+1);
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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer,List<int[]>> vertical=new TreeMap<>();
        doDfs(vertical,root,0,0);
        List<List<Integer>> result=new ArrayList<>();
        Comparator<int[]> comparator=(a,b)->{
          if(a[1]==b[1])
              return a[0]-b[0];
          return a[1]-b[1];
        };
        for(List<int[]> arr:vertical.values()){
            Collections.sort(arr,comparator);
            List<Integer> temp=new ArrayList<>();
            for(int[] i:arr){
                temp.add(i[0]);
            }
            result.add(temp);
        }
        return result;
    }
    
    private void doDfs(Map<Integer,List<int[]>> vertical,TreeNode node,int 
        current,int level){
        if(!vertical.containsKey(current))
            vertical.put(current,new ArrayList<>());
        vertical.get(current).add(new int[]{node.val,level});
        
        if(node.left!=null)
            doDfs(vertical,node.left,current-1,level+1);
        
        if(node.right!=null)
            doDfs(vertical,node.right,current+1,level+1);
    }
}
