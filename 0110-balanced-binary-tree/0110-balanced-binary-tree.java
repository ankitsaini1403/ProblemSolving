class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true ;

        Queue<TreeNode>queue = new LinkedList<>();

        queue.offer(root);


        while(!queue.isEmpty()){
            TreeNode node = queue.poll();

            int left = height(node.left);
            int right = height(node.right);

            if(Math.abs(left-right)>1)return false ;

            if(node.left!= null) queue.offer(node.left);
            if(node.right!= null) queue.offer(node.right);
        }    

        return true ;

    }
public int height(TreeNode root){
       if(root == null) return 0 ;

    Queue<TreeNode>queue = new LinkedList<>();
     queue.offer(root);
     int height =0 ;

     while(!queue.isEmpty()){
          int size = queue.size();

          for(int i =0 ; i<size ; i++){
               TreeNode node = queue.poll();

               if(node.left!= null) queue.offer(node.left);
               if(node.right!= null) queue.offer(node.right);

          }

          height++;
     }

     return height ;


}


    }

