/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null){
            return false;
        }
        
        return isSubTree(root1, root2) ||
            HasSubtree(root1.left, root2) ||
            HasSubtree(root1.right, root2);
    }
    
    public boolean isSubTree(TreeNode root1, TreeNode root2){
        if(root2 == null){
            return true;
        }
        if(root1 == null){
            return false;
        }
        
        return root1.val == root2.val &&
            isSubTree(root1.left, root2.left) &&
            isSubTree(root1.right, root2.right);
    }
}