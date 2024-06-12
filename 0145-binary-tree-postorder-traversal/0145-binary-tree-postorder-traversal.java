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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> post = new ArrayList();
        traverse(root,post);
        return post;
    }
    static void traverse(TreeNode cur,List<Integer> post){
        if(cur==null)
          return;
        traverse(cur.left,post);
        traverse(cur.right,post);
        post.add(cur.val);
    }
}