
class Solution {
    public int minDepth(TreeNode root) {
           if(root== null) return  0 ;

           int depth =0 ;

           Queue<TreeNode> queue = new LinkedList<>();

           queue.offer(root);


           while(!queue.isEmpty()){
               int level = queue.size();
                 depth++;
               for(int i =0 ; i<level ; i++){
                 TreeNode node = queue.poll();
                 if(node.left==null && node.right==null) return depth ;
                 if(node.left!=null) queue.offer(node.left);
                 if(node.right!=null) queue.offer(node.right);
               }
               
           }

           return 0 ;
    }
}