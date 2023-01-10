import java.util.Scanner;

public class Linked_List_K_Append {



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

    public void Append_K(int k)
    {
        System.out.println(size);
        System.out.println("Value of k : " + k);
        int k_update = size % k;

        if(k_update!=0)
        {

            Node temp = head;
            Node new_head = new Node();
            Node cpy = new_head;

            while (temp.next != null) {
                if (k_update == 0) {
                    new_head.next = temp.next;
                    temp.next = null;
                    // new_head = new_head.next;
                    break;

                }
                k_update--;
                temp = temp.next;
            }

            // Node temp2 = cpy;
            Node temp2 = new_head.next;

            while (temp2.next != null) {
                temp2 = temp2.next;
            }
            temp2.next = head;

            head = new_head.next;
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Linked_List_K_Append ob = new Linked_List_K_Append();

        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            ob.AddNode(sc.nextInt());
        }
        int k = sc.nextInt();

        ob.Display();
        ob.Append_K(k);
        ob.Display();
        

    }
    
}
