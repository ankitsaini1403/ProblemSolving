
class Solution {
    public int maxDepth(TreeNode root) {


        int depth = 0 ;
        if(root == null ) return depth ;


        Queue<TreeNode>queue  = new LinkedList<>();
             queue.offer(root);

        while(!queue.isEmpty()){
            int level = queue.size();
               depth++;

            for(int i=0 ; i<level ; i++){
                TreeNode node = queue.poll();

               if(node.left!=null) queue.offer(node.left);
               if(node.right!= null) queue.offer(node.right);
                
            }

        }
    

    return depth ;

        
    }
}