/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of 
 * their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

public class AddTwoNumbers {

    // Linked-List Definition
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x;}

        @Override
        public String toString()  {
            ListNode temp = this;
            String toString = "";
            while (temp != null) 
            {
                if (temp != this)
                    toString = toString + " -> ";
                toString = toString + Integer.toString(temp.val);
                temp = temp.next;
            }
            return toString;
        }
    }

    // Add two numbers Function
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode head = new ListNode(0);
        ListNode current = head;

        int rem = 0;
        while ((l1 != null) || (l2 != null) || (rem > 0)) 
        {
            current.next = new ListNode(0);
            current = current.next;

            int i1 = 0;
            int i2 = 0;

            if (l1 != null) 
            {
                i1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null)
            {
                i2 = l2.val;
                l2 = l2.next;
            }

            int val = i1 + i2 + rem;
            rem = val / 10;

            current.val = val % 10;
        }

        return head.next;
    }

    // Test Function
    public String test()
    {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(8);
        //return l1.toString();
        return addTwoNumbers(l1, l2).toString();
    }

    public static void main(String[] args) {
        AddTwoNumbers atn = new AddTwoNumbers();
        System.out.println(atn.test());
    }
}