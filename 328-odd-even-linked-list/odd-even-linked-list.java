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
    public ListNode oddEvenList(ListNode head) {
        
        ListNode dummyodd = new ListNode();
        ListNode dummyeven = new ListNode();

        ListNode even = dummyeven;
        ListNode odd = dummyodd;

        ListNode temp = head;
        int cnt = 0;


        while(temp != null){
            
            if(cnt%2==0){
                even.next = temp;
                even = even.next;
            }
            else{
                odd.next = temp;
                odd = odd.next;
            }

            cnt++;
            temp = temp.next;
        }

        even.next = dummyodd.next;
        odd.next = null;

        return dummyeven.next;
        
    }
}