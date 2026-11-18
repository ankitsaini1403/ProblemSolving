
class Solution {
   class Pair{
         TreeNode node ;
         int sum ;

         Pair(TreeNode node , int sum){
             this.node = node ;
             this.sum = sum ;
         }
   }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root == null ) return false ;

        Queue<Pair>queue = new LinkedList<>();

        queue.offer(new Pair(root, targetSum - root.val));


        while(!queue.isEmpty()){
             Pair curr  =  queue.poll();

             if(curr.node.left == null && curr.node.right == null &&  curr.sum== 0){
                  return   true ;
             }

             if(curr.node.left != null){
                  queue.offer(new Pair(curr.node.left , curr.sum - curr.node.left.val));
                 
             }

             if(curr.node.right != null){
                  queue.offer(new Pair(curr.node.right , curr.sum - curr.node.right.val));
             }
        }
        return false ;
    }
}