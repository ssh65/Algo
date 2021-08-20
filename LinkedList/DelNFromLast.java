package LinkedList;

import java.util.*;

public class DelNFromLast {
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
        System.out.println("Which element from last you want to delete?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Delete(list, n);
        System.out.println("The new Linked List is ");
        LinkedList.Display(list);
    }

    static void Delete(LinkedList list, int n) {
        LinkedList.Node temp = list.head;
        LinkedList.Node m = list.head;
        LinkedList.Node prev = list.head;
        for (int i = 1; i < n; i++)
            temp = temp.next;

        while (temp.next != null) {
            temp = temp.next;
            prev = m;
            m = m.next;
        }

        prev.next = m.next;
    }
}
