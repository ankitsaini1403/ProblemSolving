
class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        return   isTrue(root.left, root.right);
    }

    public boolean isTrue(TreeNode root1, TreeNode root2){
           if(root1 == null && root2 == null) return  true ;
           if(root1 == null || root2 == null) return false ;
           if(root1.val != root2.val) return false  ;

           boolean  left = isTrue(root1.left , root2.right);
           boolean right = isTrue(root1.right , root2.left);

           return left && right ;

    }
}