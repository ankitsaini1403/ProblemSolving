
class Solution {
    public ListNode sortList(ListNode head) {
         if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head ;
        ListNode fast = head ;

        while(fast.next != null  && fast.next.next != null){
              slow= slow.next ;
              fast = fast.next.next ;
        }
  
       ListNode head1 = slow.next ;
       slow.next = null ;

       head = sortList(head);
       head1 = sortList(head1);
       
       return merge(head, head1);


    }

    public ListNode merge(ListNode head,ListNode head1){
            ListNode dummy = new ListNode(0);
            
            ListNode temp = dummy ;
            ListNode  temp1 = head ;
            ListNode temp2 = head1 ;

            while(temp1 != null && temp2!= null){
                 if(temp1.val<=temp2.val){
                      temp.next = temp1;
                      temp1 =temp1.next ;
                 }
                 else {
                      temp.next = temp2 ;
                      temp2 =temp2.next ;
                 }
                 temp = temp.next ;
            }

            if(temp1 != null){
                 temp.next = temp1 ;
            }
            else {
                  temp.next = temp2 ;
            }

            return dummy.next ;
    }
}