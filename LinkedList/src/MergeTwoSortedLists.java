/**
 * @author DouDou
 * @create 23-Mar-2022 4:49 PM
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
 class ListNode21 {
    int val;
    ListNode21 next;
    ListNode21() {}
    ListNode21(int val) { this.val = val; }
    ListNode21(int val, ListNode21 next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists {
//iteration
/*    public ListNode21 mergeTwoLists(ListNode21 list1, ListNode21 list2) {
        ListNode21 anshead = new ListNode21(-1);
        ListNode21 ans = anshead;
        if(list2==null){
            return list1;
        }
        if(list1==null){
            return list2;
        }
        while(list1!=null&&list2!=null) {
            if (list1.val > list2.val) {
                ans.next = list2;
                list2 = list2.next;
            } else {
                ans.next = list1;
                list1 = list1.next;
            }
            ans=ans.next;
        }
        ans.next=list1==null?list2:list1;

        return anshead.next;

    }*/
//Recursion
public ListNode21 mergeTwoLists(ListNode21 list1, ListNode21 list2) {
    if(list1==null){
        return list2;
    }else if(list2==null){
        return list1;
    }else if(list1.val>list2.val){
        list2.next= mergeTwoLists(list1,list2.next);
        return list2;
    }else{
        list1.next = mergeTwoLists(list1.next,list2);
        return list1;
    }

}


    public static void main(String[] args) {
        ListNode21 node3 = new ListNode21(4);
        ListNode21 node2 = new ListNode21(2,node3);
        ListNode21 list1 = new ListNode21(1,node2);

        ListNode21 l2node3 = new ListNode21(4);
        ListNode21 l2node2 = new ListNode21(3,l2node3);
        ListNode21 list2 = new ListNode21(1,l2node2);

       MergeTwoSortedLists mt = new MergeTwoSortedLists();
       ListNode21 ans = mt.mergeTwoLists(list1,list2);
       while(ans!=null){
           System.out.println(ans.val);
           ans=ans.next;
       }


    }
}
