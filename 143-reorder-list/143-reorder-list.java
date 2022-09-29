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
    
    public ListNode reverseLinkedList(ListNode head){
        
        
        ListNode prev=null;
        ListNode curr=head;
        ListNode nextCurr=head.next;
        
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=nextCurr;
            
            if(nextCurr!=null){
                nextCurr=nextCurr.next;
            }
        }
        
        return prev;
    }
    public ListNode reachMid(ListNode head){
        
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode slow=head;
        
        ListNode fast=head.next.next;
        
        while(fast!=null){
            slow=slow.next;
            
            if(fast==null)
                break;
            if(fast.next!=null)
                fast=fast.next.next;
            else if(fast.next==null){
                break;
            }
        }
        
        return slow;
    }
    
    public void reorderList(ListNode head) {
        
        if(head !=null && head.next !=null){
            ListNode middleNode=reachMid(head);

            ListNode curr2=middleNode.next;

            middleNode.next=null;

            ListNode pointer2=reverseLinkedList(curr2);

            ListNode pointer1=head;

            ListNode pointerNext1=head.next;

            ListNode pointerNext2=pointer2.next;

            while(pointer1!=null && pointer2!=null){

                pointer1.next=pointer2;
                pointer2.next=pointerNext1;

                pointer1=pointerNext1;
                pointer2=pointerNext2;

                if(pointerNext1!=null){
                    pointerNext1=pointerNext1.next;
                }
                if(pointerNext2!=null){
                    pointerNext2=pointerNext2.next;
                }
            }
        }
    }
}