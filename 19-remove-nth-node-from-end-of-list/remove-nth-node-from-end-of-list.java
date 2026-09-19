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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode dummy=head;
        int count=1;
        while(dummy.next!=null){
            dummy=dummy.next;
            count++;
        }
        int a=count-n;
        if(a==0){
            head=head.next;
            return head;
        }
        for(int i=1;i<a;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}