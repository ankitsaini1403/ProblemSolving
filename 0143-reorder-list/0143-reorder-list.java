class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
       
       ListNode  slow = head ;
       ListNode  fast = head ;

       while(fast.next != null && fast.next.next != null){
             slow = slow.next ;
             fast  = fast.next.next;
       }
        ListNode curr = slow.next ;
        ListNode prev = null ;
        slow.next = null ;

       
       while(curr != null){
         ListNode next = curr.next ;
         curr.next = prev ;
         prev = curr ;
         curr  = next ;
       }

       ListNode left = head ;
       ListNode right = prev ;

       while(right != null){
         ListNode next1 = left.next ;
         ListNode next2 = right.next ;

         left.next = right ;
         right.next = next1 ;
          
          left = next1 ;
          right = next2 ;
       }



       
     
    }
}
