package 剑指;

/**
 * @author hit-eason
 * @version 1.0
 * @date 2021/6/15 16:11
 */
public class NO28 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        if( root == null )
            return true;
        return judge(root.left,root.right);
    }
    /**
     * 先看两层，即为左二子等于右儿子，再看三层，即左儿子的左儿子等于右儿子的右儿子等等，然后发散递推
     * @param left
     * @param right
     * @return boolean
     * @create 2021/6/15 16:24
     */
    public boolean judge(TreeNode left, TreeNode right){
        if( left == null && right == null )
            return true;
        else if( left == null || right == null )
            return false;
        else if( left.val == right.val){
            return judge(left.right,right.left) && judge(left.left,right.right);
        }
        else
            return false;
    }
}
