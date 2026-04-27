package pr.iceworld.fernando.leetcode.easy;

/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. 
 * Return the linked list sorted as well.
 * 
 * Input: head = [1,1,2]
 * Output: [1,2]
 * 
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 */
public class lc_0083_remove_duplicates_from_sorted_list {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {

            ListNode cur = head;
            while (cur != null && cur.next != null) {
                if (cur.val == cur.next.val) {
                    cur.next = cur.next.next;
                } else {
                    cur = cur.next;
                }
            }
            return head;
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        var listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        var result = s.deleteDuplicates(listNode);
        while (result!= null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

}