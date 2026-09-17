/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         
         ListNode prev1 = null ;
         ListNode curr1 = l1 ;

         while(curr1!= null){
             ListNode next = curr1.next ;
             curr1.next = prev1 ;
             prev1 = curr1 ;
             curr1 =next ;
         }

         ListNode prev2 = null ;
         ListNode curr2 = l2 ;

         while(curr2!= null){
             ListNode next = curr2.next ;
             curr2.next  = prev2 ;
             prev2 = curr2 ;
             curr2 = next ;
         } 

         int carry = 0;
          ListNode dummy = new ListNode(0);
          ListNode curr = dummy ;
         while(prev1 != null || prev2 != null || carry != 0){
             int sum = carry ;

             if(prev1!= null){
                 sum+= prev1.val ;
                 prev1  = prev1.next ;
             }
             if(prev2!=null){
                  sum += prev2.val ;
                  prev2 = prev2.next ;
             }
             carry = sum/10 ;
             curr.next = new ListNode(sum%10);
             curr = curr.next ;
         }

         ListNode head2 = dummy.next ;
         ListNode prev = null ;
         ListNode curr3= head2 ;

         while(curr3!= null){
             ListNode next = curr3.next ;
             curr3.next = prev ;
             prev = curr3 ;
             curr3 =  next ;
         }


         return prev ;



    }
}