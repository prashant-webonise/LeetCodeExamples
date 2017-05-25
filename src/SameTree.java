/**
 * Given two binary trees, write a function to check if they are equal or not.
 * <p>
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class SameTree {
    public static void main(String[] args) {
        isSameTree(new TreeNode(2), new TreeNode(2));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return p == null && q == null
                || p != null && q != null && (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
