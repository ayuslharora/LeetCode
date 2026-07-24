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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return rec(p,q);
    }

    public boolean rec(TreeNode p, TreeNode q){
        if(p==null || q==null){
            if(p==null && q==null){
                return true;
            }else{
                return false;
            }
        }else if(p.val!=q.val){
            return false;
        }

        return rec(p.left,q.left) && rec(p.right,q.right);
    }
}