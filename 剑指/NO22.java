package 剑指;

/**
 * @author hit-eason
 * @version 1.0
 * @date 2021/6/14 18:08
 */
public class NO22 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    /**
     * 剑指offer 22题返回倒数第K个节点，比较简单的双指针
     * @param head 
     * @param k
     * @return 剑指.NO22.ListNode 
     * @create 2021/6/14 18:14
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head == null)
            return null;
        ListNode res = head;
        ListNode explore=head;
        for( int i =1; i < k && explore.next != null; ++i){
            explore = explore.next;
        }
        while( explore.next != null){
            explore = explore.next;
            res = res.next;
        }
        return res;
    }
}
