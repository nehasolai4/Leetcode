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
    public ListNode reverseList(ListNode head) {
        
        Deque<Integer> stack = new ArrayDeque<>();

        ListNode dummy = head;

        while(dummy!=null){
            stack.push(dummy.val);
            dummy=dummy.next;
        }

        ListNode head2= new ListNode();
        
        ListNode curr = head2;


        while(!stack.isEmpty()){
            curr.next= new ListNode(stack.pop());
            curr = curr.next;
        }

        return head2.next;


    }
}