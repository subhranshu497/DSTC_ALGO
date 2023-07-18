package datastructures.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue q = new Queue(1);
        q.printQueue();
        System.out.println("Lets Enquque");
       // q.enQueue(2);
        q.printQueue();
        System.out.println("Let's do Dqueue===========");
        q.deQueue();
        q.printQueue();
    }
}
