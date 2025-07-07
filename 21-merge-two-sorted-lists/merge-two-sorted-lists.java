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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i = list1;
        ListNode j = list2;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(i != null && j != null){
            if(i.val <= j.val){
                temp.next = i;
                temp = temp.next;
                i = i.next;
            }
            else{
                temp.next = j;
                temp = temp.next;
                j = j.next;
            }
        }

        while(i != null){
            temp.next = i;
            temp = temp.next;
            i = i.next;
        }

         while(j != null){
            temp.next = j;
            temp = temp.next;
            j = j.next;
        }

        return dummy.next;
    }
}