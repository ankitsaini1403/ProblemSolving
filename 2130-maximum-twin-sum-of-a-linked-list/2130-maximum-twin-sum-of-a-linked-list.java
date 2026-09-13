class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        
        while(fast.next != null && fast.next.next !=null){
              slow = slow.next ;
              fast  = fast.next.next;
        }

        ListNode head1 = slow.next ;
        slow.next = null ;
        ListNode prev = null ;

        while(head1!=null){
               ListNode next = head1.next ;
               head1.next = prev  ;
               prev = head1 ;
               head1 = next ;
        }

        int maxSum = Integer.MIN_VALUE;

        while(head!= null){
              maxSum = Math.max(maxSum ,head.val+prev.val);
              head = head.next ;
              prev = prev.next;
        }
        return maxSum ;
      
    }
}
