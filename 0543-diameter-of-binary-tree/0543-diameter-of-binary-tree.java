
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {

        if(root == null )return 0 ;

        int diameter =0 ;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();

            int left = height(node.left);
            int right = height(node.right);

             diameter = Math.max(diameter, left+right);

             if(node.left!=null) queue.offer(node.left);
             if(node.right != null) queue.offer(node.right);

        }

        return diameter;
        
    }


    public int height(TreeNode root){
        if(root == null) return 0;
         int heigh =0 ;
          Queue<TreeNode> queue = new LinkedList<>();
          queue.offer(root);

       
         while(!queue.isEmpty()){
              int size = queue.size();
         for(int i =0 ; i<size ; i++){
            TreeNode node = queue.poll();
            if(node.left!=null) queue.offer(node.left);
            if(node.right!= null )queue.offer(node.right);
         }

         heigh++;
         }

         return heigh ;

    }
}