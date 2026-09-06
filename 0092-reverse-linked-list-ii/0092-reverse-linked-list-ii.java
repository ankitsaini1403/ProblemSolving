class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right) return head ;

        ListNode dummy = new ListNode(0);
        dummy.next = head ;

        ListNode prevLeft = dummy ;


        for(int i = 1 ; i<left; i++ ){
             prevLeft = prevLeft.next ;
        }

        ListNode curr = prevLeft.next ;
        ListNode prev = null ;

    for(int i =1 ;i<=right-left+1;i++){
         ListNode next = curr.next ;
         curr.next = prev ;
         prev =curr ;
         curr  =next ;
    }
      
      ListNode leftNode = prevLeft.next;
      prevLeft.next = prev ;
      leftNode.next = curr ;

      return dummy.next ;

    
    }
}
