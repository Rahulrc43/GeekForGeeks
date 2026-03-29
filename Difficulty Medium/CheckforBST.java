class Solution {
    /**
     * Validates whether a binary tree satisfies the BST property.
     * Uses a range-based recursive approach: each node must be strictly
     * within (min, max) bounds passed down from its ancestors.
     * Long bounds are used to correctly handle nodes with Integer.MIN/MAX_VALUE.
     * Time: O(n), Space: O(h) where h is the height of the tree
     *
     * @param root the root of the binary tree
     * @return true if the tree is a valid BST, false otherwise
     */
    public boolean isBST(Node root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    /**
     * Recursively validates that each node's value is strictly within (min, max).
     */
    private boolean validate(Node node, long min, long max) {
        if (node == null) {
            return true;
        }
        if (node.data <= min || node.data >= max) {
            return false;
        }
        boolean isLeftValid = validate(node.left, min, node.data);
        boolean isRightValid = validate(node.right, node.data, max);
        return isLeftValid && isRightValid;
    }
}