class Solution {
    public ListNode swapPairs(ListNode head) {
        // 1. Edge Case: If list is empty or has only 1 node, no swaps needed
        if (head == null || head.next == null) {
            return head;
        }
        
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
    
        while (prev.next != null && prev.next.next != null) {
           
            ListNode first = prev.next;
            ListNode second = first.next;
            
           
            first.next = second.next;
            second.next = first;
            prev.next = second;
            
          
            prev = first;
        }
        
        return dummy.next;
    }
}
