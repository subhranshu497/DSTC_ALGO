package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList(1);
        dl.append(2);
        dl.append(3);
        dl.append(4);
        dl.append(5);
        System.out.println("-----------------");
        dl.remove(1);
        dl.printList();
    }
}
