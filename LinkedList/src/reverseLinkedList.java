/**
 * @author DouDou
 * @create 25-Mar-2022 1:22 PM
 **/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode206 {
    int val;
    ListNode206 next;
    ListNode206() {}
    ListNode206(int val) { this.val = val; }
    ListNode206(int val, ListNode206 next) { this.val = val; this.next = next; }
}
public class reverseLinkedList {
//iteration
 /*   public ListNode206 reverseList(ListNode206 head) {
        ListNode206 pre = null;
        ListNode206 cur = head;
        while(cur!=null){
            ListNode206 next = cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }*/
//recursion
public ListNode206 reverseList(ListNode206 head) {
   if(head==null||head.next==null){
       return head;
   }
   ListNode206 newhead = reverseList(head.next);
   head.next.next=head;
   head.next=null;
   return newhead;
}
    public static void main(String[] args) {
        ListNode206 node5 = new ListNode206(5);
        ListNode206 node4 = new ListNode206(4,node5);
        ListNode206 node3 = new ListNode206(3,node4);
        ListNode206 node2 = new ListNode206(2,node3);
        ListNode206 head  = new ListNode206(1,node2);

        reverseLinkedList rl = new reverseLinkedList();
        ListNode206 ans = rl.reverseList(head);
        while(ans!=null){
            System.out.println(ans.val);
            ans=ans.next;
        }


    }
}
