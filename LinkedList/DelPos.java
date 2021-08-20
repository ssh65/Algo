package LinkedList;

import java.util.Scanner;

public class DelPos {
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
        System.out.println("Enter the index position to delete elements from");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        sc.close();
        Delete(list, pos);
        LinkedList.Display(list);
    }

    static void Delete(LinkedList list, int pos) {
        LinkedList.Node temp = list.head;
        LinkedList.Node prev = list.head;
        for (int i = 0; i < pos; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }
}