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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList();
        traverse(root,preorder);
        return preorder;
    }
    static void traverse(TreeNode cur,List<Integer> preorder){
        if(cur==null)
          return;
        preorder.add(cur.val);
        traverse(cur.left,preorder);
        traverse(cur.right,preorder);
    }
}