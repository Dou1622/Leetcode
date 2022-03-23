/**
 * @author DouDou
 * @create 23-Mar-2022 12:42 PM
 **/

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class LinkedListCycle {
    //set:3ms,43MB,94.52%
 /*   public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        while(head!=null) {
            if (!set.add(head)) {
                return true;
            }
            head=head.next;
        }
        return false;
    }*/
//Slower and faster pointer:0ms,45.9MB,100%
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode slower = head;
        ListNode faster = head.next;
        while(slower!=faster){
            if(faster==null||faster.next==null){
                return false;
            }
            slower=slower.next;
            faster=faster.next.next;
        }
        return true;

    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode firstnode = new ListNode(2);
        ListNode secondnode = new ListNode(0);
        ListNode thirdnode = new ListNode(-4);
        head.next=firstnode;
        firstnode.next=secondnode;
        secondnode.next=thirdnode;
        thirdnode.next=firstnode;

        LinkedListCycle lc = new LinkedListCycle();
        System.out.println(lc.hasCycle(head));
    }

}

