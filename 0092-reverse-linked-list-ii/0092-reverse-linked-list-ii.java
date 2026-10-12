class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
       if(left== right) return head ;
       if(head == null  || head.next ==null )return  head ;

       ListNode dummy = new ListNode(0);
       dummy.next = head ;

       ListNode leftPrev =  dummy ;

       for(int i = 1 ; i<left; i++){
         leftPrev = leftPrev.next ;
       }

      ListNode subListHead  = leftPrev.next ;
      ListNode curr = subListHead;
      ListNode prev = null ;

      for(int i =1 ; i<=right-left+1; i++){
           ListNode next=  curr.next ;
           curr.next = prev ;
           prev =  curr ;
           curr= next ;
      }

      leftPrev.next = prev ;
      subListHead.next = curr ;


      return dummy.next ;

    
    }
}
