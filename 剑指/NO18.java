package 剑指;

public class NO18 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteNode(ListNode head, int val) {
        if( head == null )
            return null;
        if( head.val != val && head.next == null)
            return head;
        if( head.val == val )
            return head.next;
        ListNode pre = head;
        ListNode nowNode = head.next;
        while( nowNode.val != val && nowNode.next!=null ){
            pre = nowNode;
            nowNode = nowNode.next;
        }
        if( nowNode.val != val )
            return head;
        pre.next = nowNode.next;
        return head;
    }
}
