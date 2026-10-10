

class Solution {
    public int getDecimalValue(ListNode head) {
        int val = 0;
        ListNode curr = head;

        while (curr != null) {
            val = val * 2 + curr.val;
            curr = curr.next;
        }

        return val;
    }
}