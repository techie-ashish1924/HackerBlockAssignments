import java.util.Scanner;

public class Kth_Node_last_from_linkedlist {

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

    public int Kth_Node_find(int k)
    {
        int ind = size - k;

        Node temp = head;

        while (temp != null)
        {
            if(ind == 0)
            {
                return temp.data;
            }
            ind--;
            temp = temp.next;

        }


        return 0;
    }

    void Display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Kth_Node_last_from_linkedlist ob = new Kth_Node_last_from_linkedlist();
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            int n = sc.nextInt();

            if (n != -1) {
                ob.AddNode(n);
            } else {
                break;
            }
        }
        int k = sc.nextInt();

        // ob.Display();
        
        System.out.println(ob.Kth_Node_find(k));
        

    }
    
}
