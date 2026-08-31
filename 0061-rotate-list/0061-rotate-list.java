
class Solution {

public int len(ListNode head) {
      int len = 0;
      ListNode temp = head ;
      while(temp!= null){
         temp =temp.next ;
         len++;
      }
      return len ;
}
    public ListNode rotateRight(ListNode head, int k) {
        if(head ==null || head.next == null)  return  head ; 
        k = k% len(head);
        if(k==0) return head ;
        ListNode  slow = head ;
        ListNode fast = head ;

        for(int i =1; i<=k ; i++){
             fast = fast.next ;
        }

        while(fast.next != null){
               slow = slow.next ;
               fast = fast.next ;
        }
         ListNode temp = slow.next ;
         slow.next = null ;
         fast.next = head ;

    return temp ;
    }
}