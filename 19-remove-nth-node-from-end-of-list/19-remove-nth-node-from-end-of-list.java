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
        if(head==null){
            return null;
        }
        
        int length=1;
        
        ListNode cur=head;
        
        while(cur.next!=null){
            length++;
            cur=cur.next;
        }
        if(length==1 && n==1){
            return null;
        }
        if(length==1){
            return head;
        }
        
        int m=length-n;
        if(m==0){
            return head.next;
        }
        ListNode prev=null;
        ListNode curr=head;
        int count=1;
        
        while(count!=m){
            count++;
            prev=curr;
            if(curr!=null)
            curr=curr.next;
            
        }
        
        if(curr.next==null){
            prev.next=null;
        }
        curr.next=curr.next.next;
        
        return head;
    }
}