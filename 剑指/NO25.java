package 剑指;

/**
 * @author hit-eason
 * @version 1.0
 * @date 2021/6/14 18:36
 */
public class NO25 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    /**
     * 还行
     * @param l1
     * @param l2
     * @return 剑指.NO25.ListNode
     * @create 2021/6/14 18:51
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode head = new ListNode(0);
        ListNode newList = head;
        while( l1!=null || l2!=null ){
            if(l1==null){
                newList.next = l2;
                l2 = l2.next;
            }
            else if(l2==null){
                newList.next = l1;
                l1 = l1.next;
            }else{
                if( l1.val <= l2.val){
                    newList.next = l1;
                    l1 = l1.next;
                }
                else{
                    newList.next = l2;
                    l2 = l2.next;
                }
            }
            newList = newList.next;
        }
        return head.next;
    }
}
