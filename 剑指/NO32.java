package 剑指;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hit-eason
 * @version 1.0
 * @date 2021/6/16 15:21
 */
public class NO32 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int[] levelOrder(TreeNode root) {
        if(root == null)
            return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> array = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            array.add(node.val);
            if(node.left!=null)
                queue.add(node.left);
            if(node.right!=null)
                queue.add(node.right);
        }
        int[] res = new int[array.size()];
        for( int i = 0 ; i < array.size(); ++i )
            res[i] = array.get(i);
        return res;
    }
}
