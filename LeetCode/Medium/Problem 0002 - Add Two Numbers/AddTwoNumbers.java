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