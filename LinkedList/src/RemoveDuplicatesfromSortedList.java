/**
 * @author DouDou
 * @create 25-Mar-2022 3:40 PM
 **/
class ListNode83 {
     int val;
     ListNode83 next;
     ListNode83() {}
     ListNode83(int val) { this.val = val; }
     ListNode83(int val, ListNode83 next) { this.val = val; this.next = next; }
 }
public class RemoveDuplicatesfromSortedList {

  /*  public ListNode83 deleteDuplicates(ListNode83 head) {
        if(head==null){
            return head;
        }
        ListNode83 cur = head;
        while(cur.next!=null){
            if(cur.val != cur.next.val){
                cur=cur.next;
            }else{
                cur.next=cur.next.next;
            }
        }
        return head;

    }*/
  public ListNode83 deleteDuplicates(ListNode83 head) {
      if(head==null)
          return head;

      ListNode83 slow = head;
      ListNode83 fast = head.next;

      while(fast!=null){
          if(slow.val==fast.val){
              slow.next=fast.next;
              fast=fast.next;
          }else{
              fast=fast.next;
              slow=slow.next;
          }

      }
      return head;



  }

    public static void main(String[] args) {
        ListNode83 node3 = new ListNode83(2);
        ListNode83 node2 = new ListNode83(1,node3);
        ListNode83 head  = new ListNode83(1,node2);

        RemoveDuplicatesfromSortedList re = new RemoveDuplicatesfromSortedList();
        ListNode83 ans = re.deleteDuplicates(head);
        while(ans!=null){
            System.out.println(ans.val);
            ans=ans.next;
        }
    }
}
