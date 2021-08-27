package LinkedList;

public class LinkedList {
    Node head;

    public static class Node { /*
                                * static class so that we don't need to have instance of outer class to create
                                * instance of inner class
                                */
        int data;
        Node next;

        public Node(int d) { // Node Constructor
            data = d;
            next = null;
        }
    }

    public static Node Insert(LinkedList list, int data) {
        Node n = new Node(data);
        Node temp;
        n.next = null;

        if (list.head == null)
            list.head = n;
        else {
            temp = list.head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = n;
        }
        return n;
    }

    public static void Display(LinkedList list) {
        Node temp = list.head;
        if (list.head == null)
            System.out.println("The linked list is empty");

        else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Insert(list, 1);
        Insert(list, 2);
        Insert(list, 3);
        Insert(list, 4);
        Display(list);
    }

}
