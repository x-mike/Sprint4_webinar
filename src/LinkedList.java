import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    Node<T> head;

    static class Node<T> {

        T data;
        Node<T> next;

        // Constructor
        Node(T t) {
            data = t;
            next = null;
        }
    }

    public void insert(T data) {
        Node<T> newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<T> last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                Node<T> rememberCurrent = current;
                current = current.next;
                return rememberCurrent.data;
            }
        };
    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.insert("Vasya");
        ll.insert("Misha");
        ll.insert("Ilya");
        for (String s:
             ll) {
            System.out.println(s);

        }
    }
}
