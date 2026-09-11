
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head ;
        ListNode prev = dummy ;
        ListNode curr  =head ;

         while(curr!= null && curr.next != null ){
              if(curr.next !=  null &&curr.val == curr.next.val){
                     curr.next= curr.next.next;
                     prev =curr;
              }
              else {
                    prev =curr ;
                    curr = curr.next ;
              }
         }
         return dummy.next ;
    }
}