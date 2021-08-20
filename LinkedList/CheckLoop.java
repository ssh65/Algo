package LinkedList;

public class CheckLoop {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.Insert(list, 8);
        LinkedList.Insert(list, 2);
        LinkedList.Node start = LinkedList.Insert(list, 3);
        LinkedList.Insert(list, 1);
        LinkedList.Insert(list, 7);
        LinkedList.Node last = LinkedList.Insert(list, 9);
        last.next = start;
        // System.out.println("The given Linked List is ");
        // LinkedList.Display(list);
        // System.out.println("");
        boolean flag = Check(list);
        if (flag)
            System.out.println("The Linked List has a loop");
        else
            System.out.println("No loop in Linked List");
    }

    static boolean Check(LinkedList list) {
        LinkedList.Node slow = list.head.next;
        LinkedList.Node fast = slow.next;
        while (slow != fast) {
            if (slow != null && fast != null) {
                slow = slow.next;
                fast = fast.next.next;
            } else
                return false;
        }
        return true;
    }
}
