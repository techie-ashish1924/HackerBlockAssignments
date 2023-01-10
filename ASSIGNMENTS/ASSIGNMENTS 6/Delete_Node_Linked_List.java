import java.util.Scanner;

public class Delete_Node_Linked_List {

    class Node {

        int data;
        Node next;
    }

    static Node head;
    static int size;

    void AddNode(int ele) {
        Node ob = new Node();
        ob.data = ele;
        ob.next = null;

        if (head == null) {
            head = ob;
            size++;
            // ob.next = null;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = ob;
            size++;
        }
    }

    void Display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void deleteNode()
    {
        Node temp = head;
        Node dummy = new Node();
        Node dummy_copy = dummy;

        while(temp.next != null)
        {
            if (temp.data < temp.next.data) {
                dummy.next = temp.next;
                // dummy = dummy.next;
            }
            else {
                dummy.next = temp;
                dummy = dummy.next;
            }

            temp = temp.next;

        }
        
        head = dummy_copy.next;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Delete_Node_Linked_List ob = new Delete_Node_Linked_List();

        while(n-->0)
        {

            ob.AddNode(sc.nextInt());
        }

        ob.Display();
        ob.deleteNode();

        ob.Display();
    }
    
}
