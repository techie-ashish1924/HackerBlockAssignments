import java.util.Scanner;

// import javax.naming.spi.DirStateFactory.Result;

// class List_Implement {

// }

public class Add_Two_Linked_List {

 
    class Node {
        int data;
        Node next;

    }

    public static Node list1, list2;

    public static Node final1;

    public Node AddNode(Node head, int ele) {

        Node ob = new Node();
        ob.data = ele;
        ob.next = null;

        if (head == null) {
            head = ob;
        } else {

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = ob;
        }

        return head;

    }

    public void Display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public Node Reverse(Node head) {
        Node curr = head;

        Node previous = null;

        while (curr != null) {
            Node temp2 = curr;

            curr = curr.next;

            temp2.next = previous;
            previous = temp2;

        }
        return previous;

    }

    public Node Add_List(Node head1, Node head2, Node res) 
    {

        Node temp1 = head1;
        Node temp2 = head2;

        int carr = 0;

        Add_Two_Linked_List obj = new Add_Two_Linked_List();
        // Node ob = new Node();

        while (temp1 != null && temp2 != null) {

            int data = temp1.data + temp2.data;
            // if (data > 9) {
           

            res = obj.AddNode(res, ((data + carr) % 10));
            carr = (int) (data + carr) / 10;
            // }

            temp1 = temp1.next;
            temp2 = temp2.next;

        }

        while (temp1 != null) {
            
            res = obj.AddNode(res, (temp1.data + carr) % 10);
            carr = (int) (carr + temp1.data) / 10;
            temp1 = temp1.next;
        }

        while (temp2 != null) {

            res = obj.AddNode(res, (temp2.data + carr) % 10);
            carr = (int) (carr + temp2.data) / 10;
            temp2 = temp2.next;
        }
        
        if (carr > 0)
        {
            res = obj.AddNode(res, carr);
        }

        return res;

    }

    public static void main(String[] args) {

        Add_Two_Linked_List ob = new Add_Two_Linked_List();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the list1 length : ");
        int len1 = sc.nextInt();
        for (int i = 0; i < len1; i++) {
            list1 = ob.AddNode(list1, sc.nextInt());
        }

        System.out.print("Enter the list2 length : ");
        int len2 = sc.nextInt();

        for (int i = 0; i < len2; i++) {
            list2 = ob.AddNode(list2, sc.nextInt());
        }

        System.out.println("List 1 : ");
        ob.Display(list1);

        System.out.println("List 2 : ");
        ob.Display(list2);

        list1 = ob.Reverse(list1);
        ob.Display(list1);

        list2 = ob.Reverse(list2);
        ob.Display(list2);

        final1 = ob.Add_List(list1, list2, final1);

        final1 = ob.Reverse(final1);
        System.out.println("After sum : ");
        ob.Display(final1);

    }

}
