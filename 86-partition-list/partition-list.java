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
    public ListNode partition(ListNode head, int x) {

        // if(head == null || head.next == null) return head;
        
        // int cnt =0;
        // int more = 0;
        // int less = 0;

        // ListNode temp = head;

        // while(temp != null){
        //     cnt++;

        //     if(temp.val >= x){
        //         more++;
        //     }
        //     else{
        //         less++;
        //     }

        //     temp = temp.next;
        // }


        // ListNode dummy = new ListNode(0);
        // ListNode curr = dummy;

        // temp = head;

        // while(temp != null && less != 0){

        //     if(temp.val < x){
        //         curr.next = temp;
        //         curr = curr.next;
        //         less--;
        //     }
        //     temp = temp.next;

        // }
        // temp = head;

        // while(temp != null && more != 0 ){

        //     if(temp.val >= x){

        //         curr.next = temp;
        //         curr = curr.next;
        //         more--;
        //     }
        //     temp = temp.next;
        // }
        // curr.next = null;

        // return dummy.next;


       ListNode lessdummy = new ListNode();
       ListNode moredummy = new ListNode();

       ListNode less = lessdummy;
       ListNode more = moredummy;


       ListNode temp = head;


       while(temp != null){

        if(temp.val < x){
            less.next = temp;
            less = less.next;
        }

        else{
            more.next = temp;
            more = more.next;
        }

        temp = temp.next;
       }

       more.next = null;
       less.next = moredummy.next;

       return lessdummy.next;
    }
}