package 剑指;

/**
 * @author hit-eason
 * @version 1.0
 * @date 2021/6/15 15:18
 */
public class NO27 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null)
            return null;
        transTree(root);
        return root;
    }
    /**
     * 不过是递归罢了
     * @param root
     * @return void
     * @create 2021/6/15 15:29
     */
    public void transTree(TreeNode root){
        if( root.left == null && root.right == null) {
        }
        else if ( root.left == null ){
            root.left = root.right;
            root.right = null;
            transTree(root.left);
        }
        else if( root.right == null ){
            root.right = root.left;
            root.left = null;
            transTree( root.right);
        }
        else{
            TreeNode temp;
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            transTree(root.left);
            transTree(root.right);
        }
    }
}
