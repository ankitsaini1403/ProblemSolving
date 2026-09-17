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
    public int[] nextLargerNodes(ListNode head) {
        ListNode prev = null ;
        ListNode  curr = head ;
        int len =0 ;

        while(curr!= null){
              len++;
             ListNode  next = curr.next ;
             curr.next = prev ;
             prev = curr ;
             curr = next ;
        }
        int ans[] = new int[len];
        Stack<Integer> stack = new Stack<>();
        stack.push(prev.val);
        prev = prev.next ;
        int idx = len-1;
        ans[idx] = 0;

        while(prev!= null){

            while(!stack.isEmpty() && stack.peek()<= prev.val){
                  stack.pop();
            }
            if(!stack.isEmpty()){
                    ans[--idx] = stack.peek() ;
            }else {
                  ans[--idx] = 0 ;
            }

            stack.push(prev.val);
            prev = prev.next ;
             
        }

       return ans ;

        
    }
}