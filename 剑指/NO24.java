package 剑指;

/**
 * @author hit-eason
 * @version 1.0
 * @date 2021/6/14 18:15
 */
public class NO24 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    /**
     * 剑指offer第23题，反转链表，简单但是有普适性思想
     * @param head 
     * @return 剑指.NO23.ListNode 
     * @create 2021/6/14 18:21
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        while( current != null){
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }
    /**
     * 题解里提到递归，尝试递归实现
     * @param head
     * @return 剑指.NO23.ListNode
     * @create 2021/6/14 18:23
     */
    public ListNode reverseListByRecursion(ListNode head){
       if( head == null || head.next == null)
           return head;
       //找到最后一个节点然后返回尾节点
       ListNode findLast = reverseListByRecursion(head.next);
       head.next.next = head;
       head.next = null;
       return findLast;
    }
}
