import java.util.Scanner;

public class Triplete_From_Three_Linked_List {


    class Node {
        int data;
        Node next;

    }

    public static Node list1, list2,list3;

    // public static Node final1;

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

    void Find(Node head1,Node head2, Node head3,int targ)
    {
        Node temp1 = head1;
        // Node temp2 = head2;
        // Node temp3 = head3;

        while(temp1 != null)
        {
            Node temp2 = head2;
            while(temp2 != null)
            {
                Node temp3 = head3;
                while (temp3 != null) {
                    if (temp1.data + temp2.data + temp3.data == targ) {
                        System.out.println(temp1.data + " " + temp2.data + " " + temp3.data);
                        return;
                    }
                    temp3 = temp3.next;
                }

                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
    
    
    }


    public static void main(String[] args) {
        
        Triplete_From_Three_Linked_List ob = new Triplete_From_Three_Linked_List();
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 3;
        int k = 3;

        list1 = ob.AddNode(list1, 12);
        list1 = ob.AddNode(list1, 6);
        list1 = ob.AddNode(list1, 29);

        list2 = ob.AddNode(list2, 23);
        list2 = ob.AddNode(list2, 5);
        list2 = ob.AddNode(list2, 28);

        list3 = ob.AddNode(list3, 90);
        list3 = ob.AddNode(list3, 20);
        list3 = ob.AddNode(list3, 59);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int k = sc.nextInt();

        // for(int i=0;i<n;i++)
        // {
        //     list1 = ob.AddNode(list1, sc.nextInt());
        // }

        // for (int i = 0; i < m; i++) {
        //     list2 = ob.AddNode(list2, sc.nextInt());
        // }

        // for (int i = 0; i < k; i++) {
        //     list3 = ob.AddNode(list3, sc.nextInt());
        // }

        // int targ = sc.nextInt();
        int targ = 101;

        ob.Find(list1, list2, list3, targ);
    }
    
}
