import java.util.Scanner;
import java.util.Stack;

public class Delete_Node_Linked_List {

    class Node {

        int data;
        Node next;

        Node() {
        }

        Node (int data) {this.data = data;}
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

    public void deleteNode() {
        Stack<Node> st = new Stack<>();

        Node temp = head;

        while (temp != null) {
            while (!st.isEmpty() && st.peek().data < temp.data)
                st.pop();
            st.push(new Node(temp.data));
            temp = temp.next;
        }

        Node tHead = new Node();
        Node s = tHead;
        while (!st.isEmpty()) {
            tHead.next = st.pop();
            tHead = tHead.next;
        }

        
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
