import java.util.ArrayList;
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
    private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> temp = new ArrayList<Integer>();
    
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if (root == null) {
            return result;
        }
        
        temp.add(root.val);
        target -= root.val;
        
        if (target == 0 && root.left == null && root.right == null) {
            result.add(new ArrayList<Integer>(temp));
        }
        
        FindPath(root.left, target);
        FindPath(root.right, target);
        
        temp.remove(temp.size() - 1);
        
        return result;
    }
}