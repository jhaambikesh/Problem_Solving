import java.util.*;

public class Q2{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode traverseL1 = l1;
        ListNode traverseL2 = l2;
        ListNode traverseRes = res;
        int carry = 0;
        //Traverse until any of the linked list are not null
        while(traverseL1!=null || traverseL2!=null){
            int sum = carry;
            //Add val of first node to sum and move to its next
            if(traverseL1!=null){
                sum += traverseL1.val;
                traverseL1 = traverseL1.next;
            }
            //Add val of second node to sum and move to its next
            if(traverseL2!=null){
                sum += traverseL2.val;
                traverseL2 = traverseL2.next;
            }
            //Add units place of sum as new node of res and move to its next
            traverseRes.next = new ListNode(sum % 10);
            traverseRes = traverseRes.next;
            //Assign tens place of sum to carry
            carry = sum / 10;
        }
        //If carry is greater than 0 then add new node to res
        if(carry>0){
            traverseRes.next = new ListNode(carry);
        }
        //return the res linked list skipping the first default zero
        return res.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode head = addTwoNumbers(l1,l2);

        ListNode traverse = head;

        System.out.print("head--->");

        while(traverse!=null){
            System.out.print(traverse.val + "--->");
            traverse = traverse.next;
        }
        System.out.println("null");
    }
}

class ListNode {
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