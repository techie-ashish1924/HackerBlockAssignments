
class List_Implement {

    class Node {

        int data;
        Node next;
    }

    static Node head;

    void AddNode(int ele) {
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

    void Display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public Node EvenOdd()
    {
        Node Even = new Node();
        Node Even_copy = Even;

        Node Odd = new Node();
        Node Odd_copy = Odd;

        Node temp = head;

        while (temp != null) {
            if (temp.data % 2 == 0) {
                Even.next = temp;
                Even = Even.next;
            } else {
                Odd.next = temp;
                Odd = Odd.next;
            }

            temp = temp.next;
        }
        Even.next = null;
        Odd.next = Even_copy.next;
        // Even.next = Odd_copy.next;

        return Odd_copy.next;

    }
    
    public void ODD_Even_Display()
    {
        Node temp = EvenOdd();

        while(temp != null)
        {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}


public class LL_Odd_Even {


    

    

    public static void main(String[] args) {
        
        List_Implement obj = new List_Implement();
        obj.AddNode(10);
        obj.AddNode(21);
        obj.AddNode(30);
        obj.AddNode(40);
        obj.AddNode(50);

        obj.Display();
        obj.ODD_Even_Display();
    }

}
