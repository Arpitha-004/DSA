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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
        traverse(root,inorder);
        return inorder;
    }
    static void traverse(TreeNode cur,List<Integer> inorder){
        if(cur==null)
         return;
        traverse(cur.left,inorder);
        inorder.add(cur.val);
        traverse(cur.right,inorder);
    }
}