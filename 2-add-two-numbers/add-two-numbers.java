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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode d = new ListNode(0);

        ListNode curr = d;
        int sum =0, c=0;
        while(l1 != null || l2 != null || c!=0){
            sum =c ;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            c = sum/10;

            curr.next = new ListNode(sum%10);
            curr = curr.next;

            
        }


        return d.next;
    }
}