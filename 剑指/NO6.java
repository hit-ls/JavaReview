package 剑指;


import java.util.List;
import java.util.Stack;

public class NO6 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        int[] res = new int[]{};
        ListNode head= new ListNode(1);
        System.out.println(reversePrint(head));
    }
//    public static int[] reversePrint(ListNode head) {
//            int length=1;
//            int i;
//            ListNode nowNode = head;
//            int[] noNeed= new int[]{};
//            if(nowNode==null)
//                return noNeed;
//            else{
//                while(nowNode.next!=null) {
//                    nowNode = nowNode.next;
//                    length++;
//                }
//            }
//            int[] res = new int[length];
//            int[] resReverse = new int[length];
//            nowNode = head;
//            for( i  = 0;i<length;++i){
//                res[i] = nowNode.val;
//                nowNode=nowNode.next;
//            }
//            for(int j = 0;j<length;++j){
//                resReverse[j] = res[i-1-j];
//            }
//            return resReverse;
//    }
    public static int[] reversePrint(ListNode head){
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode nowNode = head;
        while(nowNode!=null){
            stack.push(nowNode);
            nowNode=nowNode.next;
        }
        int size = stack.size();
        int[] res = new int[size];
        for(int i = 0;i<size;++i){
            res[i] = stack.pop().val;
        }
        return res;
    }
}
