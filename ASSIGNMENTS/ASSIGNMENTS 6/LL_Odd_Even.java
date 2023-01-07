
public class LL_Odd_Even {


    

    class Node {

        int data;
        Node next;
    }

    public static Node head;

    public void AddNode(int ele)
    {
        Node ob = new Node();
        ob.data = ele;
        ob.next = null;

        if (head == null) {
            head = ob;
            // ob.next = null;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = ob;
        }
    }
    
    public void Display()
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + "-->");
        }
        System.out.println();
    }

}
