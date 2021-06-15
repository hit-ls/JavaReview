package 剑指;

/**
 * @author hit-eason
 * @version 1.0
 * @date 2021/6/15 0:30
 */
public class NO26 {
     public class TreeNode{
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
     /**
      * 递归匹配当前节点和当前左子节点和当前右子节点 与 B是否等价
      * @param A 
      * @param B
      * @return boolean 
      * @create 2021/6/15 0:46
      */
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return !( A == null || B == null) && (judge(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B) );
    }
    /**
     * B为空时代表匹配成功结束，B不为空但A为空或A与B的值不等都为失败
     * @param A 
     * @param B
     * @return boolean 
     * @create 2021/6/15 0:47
     */
    public boolean judge(TreeNode A,TreeNode B){
        if(B==null)
            return true;
        if(A==null || A.val!=B.val)
            return false;
        return judge(A.left,B.left) && judge(A.right,B.right);
    }
}
