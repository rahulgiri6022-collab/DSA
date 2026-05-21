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
        if(head==null||head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode current= slow.next;
        ListNode front=current;
        ListNode pre=null;
        while(current!=null){
            front=current.next;
            current .next=pre;
            pre=current;
            current =front;
           
            
        }
        ListNode temp=head;
        while(pre!=null){
            if(temp.val!=pre.val){
                return false;
            }
            temp=temp.next;
            pre=pre.next;
        }
        return true;
        
    }
}