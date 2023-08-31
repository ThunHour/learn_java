public class LinkedList {

    public Node head;
    public Node tail;

    public static class Node {
        String data;
        Node next;
        Node previous;

        public Node(String data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public void display(Node head) {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(current);
    }

    public void displayinreverse(Node tail) {
        if (tail == null) {
            return;
        }
        Node current = tail;
        while (current != null) {
            System.out.print(current.data);
            current = current.previous;
        }
        System.out.println(current);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node("3.5");
        Node second = new Node("1.6");
        Node third = new Node("8.7");
        Node fourth = new Node("11.9");
        Node fifth = new Node("7.4");

        list.tail = new Node("1.1");

        // list.head.next = null;

        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = list.tail;
        list.tail.next = null;

        list.head.previous = null;
        second.previous = list.head;
        third.previous = second;
        fourth.previous = third;
        fifth.previous = fourth;
        list.tail.previous = fifth;

        list.display(list.head);
        // list.displayinreverse(list.tail);
    }
}