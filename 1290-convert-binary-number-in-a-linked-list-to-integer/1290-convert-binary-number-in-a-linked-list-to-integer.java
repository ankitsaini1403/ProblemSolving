

class Solution {
    public int getDecimalValue(ListNode head) {
       int val = 0 ;

       ListNode temp= head ;

       while(temp != null){
          val = val*2 + temp.val ;
          temp = temp.next ;
       }

       return val ;
    }
}