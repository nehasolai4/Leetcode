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
    public boolean isPalindrome(ListNode head) {
        
        ListNode dummy = head;
        Deque<Integer> stack = new ArrayDeque<>();

        int len=0;
        while(dummy!=null){
            len++;
            dummy=dummy.next;
        }

        dummy=head;

        for(int i=0;i<len/2;i++){
            stack.push(dummy.val);
            dummy=dummy.next;
        }

        if(len%2!=0)
            dummy=dummy.next;


        while(dummy!=null){
            if(dummy.val!=stack.pop()){
               return false;
            }
            dummy=dummy.next;
        }

        return true;
    }
}