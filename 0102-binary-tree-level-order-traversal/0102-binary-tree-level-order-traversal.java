class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
     List<List<Integer>> ans = new ArrayList<>();

     if(root==null) return ans ;
        
        Queue<TreeNode>queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
             int level = queue.size();
             List<Integer>res= new ArrayList<>();

             for(int i =0 ; i<level ; i++){
                  TreeNode node = queue.poll();
                    res.add(node.val);

                    if(node.left!= null) queue.offer(node.left);
                    if(node.right!= null)queue.offer(node.right);
             }

             ans.add(res);
        }


        return ans ;

    }
}
