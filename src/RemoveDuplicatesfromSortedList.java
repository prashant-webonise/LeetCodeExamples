/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 */
public class RemoveDuplicatesfromSortedList {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode listNode2 = node;
        listNode2.next = new ListNode(1);
        listNode2 = listNode2.next;
        listNode2.next = new ListNode(2);
        listNode2 = listNode2.next;
        listNode2.next = new ListNode(3);
        listNode2 = listNode2.next;
        listNode2.next = new ListNode(3);
        listNode2 = listNode2.next;
        listNode2.next = new ListNode(6);
        listNode2 = listNode2.next;
        listNode2.next = new ListNode(6);
        listNode2 = listNode2.next;
        listNode2.next = new ListNode(6);

        System.out.println(node);
        ListNode listNode = deleteDuplicates(node);
        System.out.println(listNode);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return val + (next == null ? " " : next.toString());
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            if (next == null) {
                break;
            }
            if (current.val == next.val) {
                current.next = next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
