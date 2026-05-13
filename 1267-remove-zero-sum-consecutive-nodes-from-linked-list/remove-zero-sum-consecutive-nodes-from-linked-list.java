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
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer,ListNode> map = new HashMap<>();
        int prefix = 0;

        ListNode dummy = new ListNode(0);
        dummy.next = head;


        ListNode temp = dummy;

        while(temp != null){

            prefix += temp.val;

            map.put(prefix,temp);

            temp = temp.next;
        }

        temp =dummy;
        prefix = 0;

        while(temp != null){

            prefix += temp.val;

            temp.next = map.get(prefix).next;

            temp = temp.next;
        }

        return dummy.next;

    }
}