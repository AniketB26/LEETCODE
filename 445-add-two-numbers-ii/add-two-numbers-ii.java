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
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        while(temp1 != null || temp2 != null){

            if(temp1 != null){
                stk1.push(temp1.val);
                temp1 = temp1.next;
            }

            if(temp2 != null){
                stk2.push(temp2.val);
                temp2 = temp2.next;
            }

            
            
        }

        int carry = 0;
        int sum = 0;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(!stk1.isEmpty() || !stk2.isEmpty() || carry != 0){
            sum = carry;
            if(!stk1.isEmpty()) sum += stk1.pop();
            if(!stk2.isEmpty()) sum += stk2.pop();

            carry = sum/10;

            curr.next = new ListNode(sum%10);
            curr = curr.next;

            

            
        }

        
        dummy = dummy.next;
        curr = dummy;

        ListNode prev = null;


        while(curr != null){

            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;


    }
}