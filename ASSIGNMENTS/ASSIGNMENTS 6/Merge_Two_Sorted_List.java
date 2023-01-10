import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Merge_Two_Sorted_List {


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


    public Node Merge_Two_List(Node head1,Node head2)
    {
        Node temp1 = head1;
        Node temp2 = head2;

        Node Dummy = new Node();
        Node Dummy_cpy = Dummy;

        while(temp1 != null && temp2 != null)
        {
            if (temp1.data > temp2.data) {
                Dummy.next = temp2;
                Dummy = Dummy.next;
                // Dummy.next = null;
                temp2 = temp2.next;
            } else {
                Dummy.next = temp1;
                Dummy = Dummy.next;
                // Dummy.next = null;
                temp1 = temp1.next;
            }

        }

        while (temp1 != null)
        {
            Dummy.next = temp1;
            temp1 = temp1.next;
            Dummy = Dummy.next;
        }


        while (temp2 != null) {
            Dummy.next = temp2;
            temp2 = temp2.next;
            Dummy = Dummy.next;
        }
        
        return Dummy_cpy.next;
    }

    public static void main(String[] args) {


        Merge_Two_Sorted_List ob = new Merge_Two_Sorted_List();

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

        ob.Display(list1);
        ob.Display(list2);

        final1 = ob.Merge_Two_List(list1, list2);

        ob.Display(final1);
        

    }
    
}
