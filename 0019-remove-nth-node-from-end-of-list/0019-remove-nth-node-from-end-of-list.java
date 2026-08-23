class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

       
        if (n == length) {
            return head.next;
        }

       
        int delete = length - n;

        temp = head;

        
        for (int i = 1; i < delete; i++) {
            temp = temp.next;
        }

       
        temp.next = temp.next.next;

        return head;
    }
}
