class Solution {
    public ListNode oddEvenList(ListNode head) {
     if(head ==null || head.next == null ) return head;
        ListNode d1 = new ListNode(0);
        ListNode d2 = new ListNode(0);

        ListNode temp1 = d1;
        ListNode temp2 = d2;

        ListNode odd = head;
        ListNode even = head.next;

        while (even != null && even.next != null) {

            temp1.next = odd;
            temp1 = temp1.next;
            odd = odd.next.next;

            temp2.next = even;
            temp2 = temp2.next;
            even = even.next.next;
        }

        
        temp1.next = odd;

        
        temp2.next = even;

        
        temp1.next.next = d2.next;

        return d1.next;
    }
}

