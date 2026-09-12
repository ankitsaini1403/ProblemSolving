class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

       
        while (even != null && even.next != null) {

            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }


        odd.next = null;

        if (even != null) {
            even.next = null;
        }

        
        ListNode d1 = new ListNode(0);
        ListNode temp = d1;

        ListNode temp1 = evenHead;
        ListNode temp2 = head;

        while (temp1 != null && temp2 != null) {

            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }

        if (temp1 != null) {
            temp.next = temp1;
        }

        if (temp2 != null) {
            temp.next = temp2;
        }

        return d1.next;
    }
}
