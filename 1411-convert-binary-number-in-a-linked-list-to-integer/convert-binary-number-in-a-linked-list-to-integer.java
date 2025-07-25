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
    public int getDecimalValue(ListNode head) {
        int rst = 0;

        ListNode temp = head;

        while(temp != null){
            rst = (rst << 1) | temp.val;
            temp = temp.next;
        }

        return rst;
    }
}