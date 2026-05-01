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
        ListNode head = new ListNode();
        ListNode tail = head;

        ListNode first = list1;
        ListNode sec = list2;

        while(first != null && sec != null){
            if(first.val < sec.val){
                tail.next = first;
                first = first.next;
            }else{
                tail.next = sec;
                sec = sec.next;
            }
            tail = tail.next;
        }

        if(first != null){
            tail.next = first;
        }else{
            tail.next = sec;
        }

        return head.next;

    }
}