/**
 * @author DouDou
 * @create 24-Mar-2022 3:10 PM
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
class ListNode203 {
     int val;
      ListNode203 next;
      ListNode203() {}
      ListNode203(int val) { this.val = val; }
      ListNode203(int val, ListNode203 next) { this.val = val; this.next = next; }
  }
public class RemoveLinkedListElements {
//iteration:0ms,43.1MB
  /*  public ListNode203 removeElements(ListNode203 head, int val) {
        ListNode203 prehead = new ListNode203(-1);
        prehead.next = head;
        ListNode203 pre = prehead;
        while(pre.next!=null){
            if(pre.next.val==val){

                    pre.next = pre.next.next;

            }else {
                pre = pre.next;
            }
        }
        return prehead.next;
    }*/
//recursion:1ms,48MB
public ListNode203 removeElements(ListNode203 head, int val) {
   if(head == null){
       return  head;
   }
   head.next= removeElements(head.next,val);
   return head.val==val? head.next:head;
}

    public static void main(String[] args) {
        ListNode203 node6 = new ListNode203(6);
        ListNode203 node5 = new ListNode203(5,node6);
        ListNode203 node4 = new ListNode203(4,node5);
        ListNode203 node3 = new ListNode203(3,node4);
        ListNode203 node2 = new ListNode203(6,node3);
        ListNode203 node1 = new ListNode203(2,node2);
        ListNode203 head = new ListNode203(1,node1);

        int val =6;
        RemoveLinkedListElements re = new RemoveLinkedListElements();
        ListNode203 ans = re.removeElements(head,val);
        while(ans!=null){
            System.out.println(ans.val);
            ans=ans.next;
        }
    }
}

