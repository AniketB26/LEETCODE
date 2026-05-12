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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n =0;

        ListNode temp = head;

        while(temp != null){

            n++;
            temp = temp.next;
        }

        

        int gap = n/k;


        
        int rem = n%k;


        temp = head;

        ListNode[] ans = new ListNode[k];

        

        for(int i =0; i< k ; i++){
            ans[i] = temp;

            int currpart = gap;

            if(rem > 0){
                currpart++;
                rem--;
            }

            for(int j =0; j<currpart-1; j++){

                if(temp != null) temp = temp.next;
                

            }

            if(temp != null){
                ListNode nextt = temp.next;
                temp.next = null;
                temp = nextt;
            }


        }

        return ans;


    }
}