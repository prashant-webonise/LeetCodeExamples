/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(5);
        listNode.next = new ListNode(6);
        listNode.next.next = new ListNode(7);

        ListNode listNode2 = new ListNode(7);
        listNode2.next = new ListNode(8);
        listNode2.next.next = new ListNode(9);

        ListNode addTwoNumbers = addTwoNumbers(listNode, listNode2);
        System.out.println(addTwoNumbers);
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode output = new ListNode(0);

        int carry = 0;
        ListNode a = l1;
        ListNode b = l2;
        ListNode curr = output;

        while (a != null || b != null) {
            int sum = 0;
            if (a != null) {
                sum += a.val;
                a = a.next;
            }
            if (b != null) {
                sum += b.val;
                b = b.next;
            }
            sum += carry;

            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return output.next;
    }
}
