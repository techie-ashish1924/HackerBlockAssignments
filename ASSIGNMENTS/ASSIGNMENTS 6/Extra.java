import java.util.*;

public class Extra {
    public class Node {
        int val;
        Node next;

        Node(int data) {
            this.val = data;
            this.next = null;
        }
    }

    static Node list1, list2; // list1 = head , list2 = head
    static int size;

    public Node AddNode(Node head, int data) {

        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            size++;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
            size++;
        }
        return head;
    }

    public void Display(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println(" ");
    }

    public Node SortedTwoList(Node list1, Node list2) {
        Node dummy = new Node(0);
        Node temp = dummy;
        Node curr1 = list1;
        Node curr2 = list2;
        while (curr1 != null && curr2 != null) {
            if (curr1.val < curr2.val) {
                Node newone = new Node(curr1.val);
                temp.next = newone;
                temp = newone;
                curr1 = curr1.next;
            } else {
                Node newone = new Node(curr2.val);
                temp.next = newone;
                temp = newone;
                curr2 = curr2.next;
            }
        }
        while (curr1 != null) {
            Node newone = new Node(curr1.val);
            temp.next = newone;
            temp = newone;
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            Node newone = new Node(curr2.val);
            temp.next = newone;
            temp = newone;
            curr2 = curr2.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Extra ll = new Extra();

        while (n-- > 0) {
            
            int no = sc.nextInt();
            while (no-- > 0) {
                list1 = ll.AddNode(list1, sc.nextInt());
            }
            int no1 = sc.nextInt();
            while (no1-- > 0) {
                list2 = ll.AddNode(list2, sc.nextInt());
            }
        }
        // ll.Display(list1);
        // ll.Display(list2);

        ll.Display(ll.SortedTwoList(list1, list2));
        list1 = null;
        list2 = null;
        size = 0;
    }
}