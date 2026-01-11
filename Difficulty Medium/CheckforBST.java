class Solution {
    public boolean isBST(Node root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
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