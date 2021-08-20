package LinkedList;

public class CheckCircular {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.Insert(list, 8);
        LinkedList.Insert(list, 2);
        LinkedList.Insert(list, 3);
        LinkedList.Insert(list, 1);
        LinkedList.Node last = LinkedList.Insert(list, 7);
        last.next = list.head;
        // System.out.println("The given Linked List is ");
        // LinkedList.Display(list);
        System.out.println("");
        boolean flag = Check(list);
        if (flag)
            System.out.println("The Linked List is Circular");
    }

    static boolean Check(LinkedList list) {
        LinkedList.Node temp = list.head.next;
        // LinkedList.Node first = list.head;
        while (true) {
            if (temp == list.head) {
                return true;
            }

        }
    }
}
