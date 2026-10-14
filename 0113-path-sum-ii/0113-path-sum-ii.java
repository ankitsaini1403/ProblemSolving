
class Solution {
   List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
      func(root, targetSum , new ArrayList<>());
        
        return ans ;
    }

    public  void  func(TreeNode root, int targetSum , List<Integer> path ){
           
           if(root == null ) return ;

           path.add(root.val);

           if(root.left ==null && root.right == null && root.val == targetSum) {
               ans.add(new ArrayList<>(path));
           }


           func(root.left, targetSum-root.val , path);
           func(root.right, targetSum-root.val , path);

           path.remove(path.size()-1);


    }
}