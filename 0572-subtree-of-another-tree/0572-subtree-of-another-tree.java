
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false ;
         
         if(sameTree(root, subRoot)) return true ;

         return isSubtree(root.left , subRoot) || isSubtree(root.right , subRoot);

    }


    public boolean sameTree(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true ;
        if(root1 == null || root2 == null) return false ;
        if(root1.val != root2.val) return false ;

        boolean left  = sameTree(root1.left , root2.left);
        boolean right = sameTree(root1.right , root2.right);

        return left && right ;
    

    }
}