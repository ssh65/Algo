package LinkedList;

public class Reverse {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.Insert(list, 8);
        LinkedList.Insert(list, 2);
        LinkedList.Insert(list, 3);
        LinkedList.Insert(list, 1);
        LinkedList.Insert(list, 7);
        System.out.println("The given Linked List is ");
        LinkedList.Display(list);
        System.out.println("");
        System.out.println("The reverse of the Linked List is ");
        reverse(list);
        LinkedList.Display(list);
    }

    static void reverse(LinkedList list) {
        if (list.head.next == null) {
            return;
        }
        int temp = list.head.data;
        list.head = list.head.next;
        reverse(list);
        LinkedList.Insert(list, temp);
    }
}
