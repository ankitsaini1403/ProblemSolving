class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

       
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        
        ListNode right = slow.next;
        slow.next = null;

        ListNode prev = null;

        while (right != null) {
            ListNode next = right.next;
            right.next = prev;
            prev = right;
            right = next;
        }

        
        right = prev;


        ListNode left = head;

        while (right != null) {
            ListNode next1 = left.next;
            ListNode next2 = right.next;

            left.next = right;
            right.next = next1;

            left = next1;
            right = next2;
        }
    }
}
