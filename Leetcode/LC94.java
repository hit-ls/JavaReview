package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC94 {
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode pre = null;
        while(root != null){
            if(root.left != null){
                pre = root.left;
                while(pre.right != null && pre.right != root){
                    pre = pre.right;
                }
                if(pre.right == null){
                    pre.right = root;
                    root = root.left;
                }else{
                    list.add(root.val);
                    pre.right = null;
                    root = root.right;
                }
            }else{
                list.add(root.val);
                root = root.right;
            }

        }
        return list;
    }
}
