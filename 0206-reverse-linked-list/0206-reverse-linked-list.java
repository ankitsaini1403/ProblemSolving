class Solution {
    public ListNode reverseList(ListNode head) {
         ArrayList<Integer>list = new ArrayList<>();

         ListNode temp = head ;

         while(temp!= null){
             list.add(temp.val);
             temp =temp.next;

         }

         temp = head ;

         for(int i = list.size()-1 ;i>= 0; i--){
             temp.val = list.get(i);
             temp = temp.next ;
         }

         return head ;

    }
}
