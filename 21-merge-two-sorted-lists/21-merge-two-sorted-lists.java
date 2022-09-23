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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1==null && list2==null){
            return null;
        }
        else if(list1==null){
            return list2;
        }
        else if(list2==null){
            return list1;
        }
        
        ListNode curr1=list1;
        ListNode curr2=list2;
        ListNode newCurr;
       
        
        if(curr1.val<curr2.val){
                newCurr=curr1;
            curr1=curr1.next;
            }
            else{
                newCurr=curr2;
                curr2=curr2.next;
          }
         ListNode mergedList=newCurr;
        while(curr1!=null && curr2!=null){
            
           
             if(curr1.val<curr2.val){
                newCurr.next=curr1;
            curr1=curr1.next;
            }
            else{
                newCurr.next=curr2;
                curr2=curr2.next;
          }
            newCurr=newCurr.next;
        }
        
        while(curr1!=null){
            newCurr.next=curr1;
            curr1=curr1.next;
            newCurr=newCurr.next;
        }
        
         while(curr2!=null){
            newCurr.next=curr2;
            curr2=curr2.next;
             newCurr=newCurr.next;
        }
        
        return mergedList;
    }
}