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
import static java.lang.Integer.*;
class Solution {
    public int maxSumBST(TreeNode root) {
        int[] result = new int[1];
        postOrderMaxBst(root,result);
        return result[0];
    }
    
    private int[] postOrderMaxBst(TreeNode node,int[] maximum) {
        if(node == null)
            return new int[]{1,MIN_VALUE,MAX_VALUE,0};
        int[] left = postOrderMaxBst(node.left,maximum);
        int[] right = postOrderMaxBst(node.right,maximum);
        int current = node.val;
        if(left[0]==1&&right[0]==1&&left[1]<current&&right[2]>current) {
            left[2]=min(current,left[2]);
            left[1]=max(current,right[1]);
            int temp=left[3]+right[3]+current;
            left[3]=temp;
            maximum[0]=max(maximum[0],temp);
            //System.out.println(current+" "+maximum[0]+" "+temp);
            return left;
        }
        left[0]=0;
        left[3] =0;
        return left;
    }
}
