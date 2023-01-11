import java.util.Scanner;

public class Linked_List_Reverse_Using_Recursion {

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

    void Display() 
    {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    void Reverse_Recursion(Node prev, Node curr, Node ahead)
    {

        if (ahead == null)
        {
            head = prev;
            return;
        }
        curr.next = prev;
        prev = curr;
        Reverse_Recursion(prev, ahead, ahead.next);

    }

    void Reverse()
    {

        Linked_List_Reverse_Using_Recursion ob = new Linked_List_Reverse_Using_Recursion();
        Node prev = null;
        Node curr = head;
        Node ahead = curr.next;

        ob.Reverse_Recursion(prev, curr, ahead);
        
    }


    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;

        Linked_List_Reverse_Using_Recursion ob = new Linked_List_Reverse_Using_Recursion();

        ob.AddNode(1);
        ob.AddNode(2);
        ob.AddNode(3);
        ob.AddNode(4);
        ob.AddNode(5);

        // for(int i=0;i<n;i++)
        // {
        //     ob.AddNode(sc.nextInt());

        // }

        

        ob.Display();

        ob.Reverse();

        ob.Display();

    }
    
}
