package 剑指;

import java.util.HashMap;
import java.util.Map;

public class NO7 {
     public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
    }
    int[] preCopy;
    Map<Integer,Integer> inMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0)
            return null;
        this.preCopy = preorder;
        for(int i = 0;i<inorder.length;++i){
            inMap.put(inorder[i],i);
        }
        return resHead(0,0,inorder.length-1);
    }
    public TreeNode resHead(int nowRoot, int inLeft, int inRight){
         if(inLeft>inRight){
             return null;
         }
         TreeNode root = new TreeNode(this.preCopy[nowRoot]);
         int index = inMap.get(preCopy[nowRoot]);
         root.left = resHead(nowRoot+1,inLeft,index-1);
         root.right = resHead(nowRoot+1+index-inLeft,index+1,inRight);
         return root;
    }

}
