/**
 * leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree
 */

class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode current = root;
        int a = Math.min(p.val,q.val);
        int b = Math.max(p.val, q.val);
        while (true) {
            if (a < current.val && b < current.val) {
                current = current.left;
            } else if (a > current.val) {
                current = current.right;
            } else {
                return current;
            }
        }
    }
}
