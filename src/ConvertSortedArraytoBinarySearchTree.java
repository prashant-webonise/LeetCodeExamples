/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 */
public class ConvertSortedArraytoBinarySearchTree {
    public static void main(String[] args) {
        TreeNode treeNode = sortedArrayToBST(1, 3);
        System.out.println(treeNode);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode sortedArrayToBST(int... nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode tree = getTree(0, nums.length - 1, nums);
        return tree;
    }

    private static TreeNode getTree(int start, int end, int[] nums) {
        if (start == end) {
            return new TreeNode(nums[start]);
        }
        if (start < end) {
            int middle = (start + end) / 2;
            TreeNode treeNode = new TreeNode(nums[middle]);
            treeNode.left = getTree(start, middle - 1, nums);
            treeNode.right = getTree(middle + 1, end, nums);
            return treeNode;
        } else {
            return null;
        }
    }
}
