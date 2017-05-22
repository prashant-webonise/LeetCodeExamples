/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {

        ListNode par1 = new ListNode(-2);
        ListNode listNode = par1;
        listNode.next = new ListNode(5);

        ListNode par2 = new ListNode(-9);
        ListNode listNode2 = par2;
        listNode2.next = new ListNode(-6);
        listNode2 = listNode2.next;
        listNode2.next = new ListNode(-3);
        listNode2 = listNode2.next;
        listNode2.next = new ListNode(-1);
        listNode2 = listNode2.next;
        listNode2.next = new ListNode(1);
        listNode2 = listNode2.next;
        listNode2.next = new ListNode(6);


        ListNode sortedMerged = mergeTwoLists(par1, par2);
        System.out.println(sortedMerged);
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

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergedListNode = new ListNode(0);

        ListNode a = l1;
        ListNode b = l2;
        ListNode head = mergedListNode;

        while (a != null || b != null) {
            boolean hasX = false, hasY = false;
            int x = 0;
            int y = 0;
            if (a != null) {
                x = a.val;
                hasX = true;
            }

            if (b != null) {
                y = b.val;
                hasY = true;
            }

            if (hasX && hasY) {
                if (x < y) {
                    head.next = new ListNode(x);
                    head = head.next;
                    a = a.next;
                } else {
                    head.next = new ListNode(y);
                    head = head.next;
                    b = b.next;
                }
            } else {
                if (hasX) {
                    head.next = new ListNode(x);
                    head = head.next;
                    a = a.next;
                }
                if (hasY) {
                    head.next = new ListNode(y);
                    head = head.next;
                    b = b.next;
                }
            }
        }

        return mergedListNode.next;
    }
}
