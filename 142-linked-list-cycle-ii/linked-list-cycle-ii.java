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
public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head == null || head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;

        boolean hai = false;



        while(fast != null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                hai = true;
                break;
            }


        }
        

        if(hai){

            ListNode temp = head;

            while(slow != temp){
                slow = slow.next;
                temp = temp.next;
            }
        }
        else{
            return null;
        }


        return slow;


    }
}