class Solution {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);

        ListNode temp1 = dummy1;
        ListNode temp2 = dummy2;
        ListNode temp = head;

        while (temp != null) {

           
            temp1.next = temp;
            temp1 = temp1.next;

           
            if (temp.next != null) {
                temp2.next = temp.next;
                temp2 = temp2.next;
            }

            
            if (temp.next != null) {
                temp = temp.next.next;
            } else {
                temp = null;
            }
        }

        
        temp2.next = null;

       
        temp1.next = dummy2.next;

        return dummy1.next;
    }
}
