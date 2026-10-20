
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null || head.next == null) return head ;
         ListNode slow = head ;
         ListNode fast = head ;

         for(int i =  0  ; i<k ; i++){
             fast = fast.next ;
         }

         while(fast != null ){
             slow = slow.next ;
             fast = fast.next ;
         }

         fast = head ;

         for(int i = 0 ; i<k-1 ; i++){
                  fast = fast.next ;
         }

         int temp = fast.val ;
         fast.val = slow.val ;
         slow.val = temp ;


         return head ;

    }
}