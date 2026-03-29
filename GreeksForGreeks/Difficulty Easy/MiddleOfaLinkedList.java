class Solution {
    /**
     * Returns the data of the middle node of a singly linked list.
     * Uses the slow-fast pointer technique (tortoise and hare) to find the middle
     * in a single pass without counting the total length.
     * For even-length lists, returns the second middle node.
     * Time: O(n), Space: O(1)
     *
     * @param head the head of the linked list
     * @return the data of the middle node, or -1 if the list is empty
     * Example: 1 → 2 → 3 → 4 → 5 → returns 3
     */
    int getMiddle(Node head) {
        if (head == null) return -1;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
