package leetCode.LinkedList;


public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(slow != null && fast!=null && fast.next!=null && fast.next.next!=null){
            if (slow == fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}
