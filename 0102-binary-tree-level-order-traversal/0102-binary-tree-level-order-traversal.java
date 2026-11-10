class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
     List<List<Integer>>ans = new ArrayList<>();
     Queue<TreeNode>queue = new LinkedList<>();
     

     if(root == null) return ans ;

     queue.offer(root);

     while(!queue.isEmpty()){
          List<Integer>level = new ArrayList<>();
          int size=  queue.size();

          for(int i=0 ; i<size ; i++){
                TreeNode node = queue.poll();
                level.add(node.val);

                if(node.left != null)  queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);

          }

          ans.add(level);
     }


     return ans ;


     
    

    }
}
