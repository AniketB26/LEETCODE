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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k==0) return head;
        
        int cnt = 0;
        ListNode temp = head;

        while(temp != null){
            cnt++;
            temp = temp.next;
        }

        

        k = k%cnt;
        if(k==cnt || k==0) return head;

        ListNode fast = head;
        ListNode slow = head;

        int n =0;

        while(n != k){
            n++;
            fast = fast.next;
        }

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next;
        }
        temp = slow.next;
        slow.next = null;
        fast.next = head;

        

        return temp;
    }
}