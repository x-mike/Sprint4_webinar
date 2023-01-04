import java.util.Iterator;


public class LinkedList<T> implements Iterable<T>{


    Node<T> first;
    Node<T> current;
    Node<T> last;


    static class Node<T> {

        T data;
        Node<T> next;
        Node<T> prev;

        // Constructor
        Node(T data) {
            this.data = data;
            next = null;
            prev = null;

        }
    }

    public void removeFirst(){
        first = first.next;
    }

    public void removeLast(){

        Node<T> tmp = first;

        if (tmp == last)
            first = null;

        while (true){

            if (tmp.next == last)
            {
                tmp.next = null;
                break;
            }
            tmp = tmp.next;

        }
    }

    public void insert (T data){

        if (current == null) {
            current = new Node<>(data);
            first = current;
            last = current;
        }
        else {
            current.next = new Node<>(data);
            current.next.prev = current;
            current = current.next;
            last = current;
        }

    }

    public void insertByIndex(int index, T data){

        Node<T> inset = new Node<>(data);
        Node<T> tmp = first;

        int counter = 0;

        while (true){

            if (index == 0){
                inset.next = first;
                first = inset;
                break;
            }

            counter++;

            if (counter == index){
                inset.next = tmp.next;
                tmp.next = inset;
                break;
            }

            tmp = tmp.next;
        }

    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {

            Node<T> tmp = first;

            @Override
            public boolean hasNext() {
                return tmp != null;
            }

            @Override
            public T next() {
                T data = tmp.data;
                tmp = tmp.next;
                return data;
            }
        };
    }

    public static void main(String[]args){

        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.insert("Основные");
        stringLinkedList.insert("языки программирования для");
        stringLinkedList.insert("платформы Android - это");
        stringLinkedList.insert("Kotlin");
        stringLinkedList.insert("и Java");

        for (String element : stringLinkedList){
            System.out.print(element + " ");
        }

        stringLinkedList.removeFirst();

        System.out.println();

        for (String element : stringLinkedList){
            System.out.print(element + " ");
        }

        stringLinkedList.removeLast();

        System.out.println();

        for(String element : stringLinkedList){
            System.out.print(element + " ");
        }

        stringLinkedList.insertByIndex(3,"и Java");
        stringLinkedList.insertByIndex(0,"Основные");
        System.out.println();

        for(String element : stringLinkedList){
            System.out.print(element + " ");
        }

    }

    // домашнее задание
    // 1. добавить метод public void insert(T data), который бы вставлял новый Node в конец списка
    // 2. реализовать интерфейс Iterable<T> (class LinkedList<T> implements Iterable<T>)
    // 3. Добавить методы removeFirst() и removeLast() которые удаляют первый и последний элемент соотвественно
    // 4. Добавить метод insertByIndex(int index, T data), который бы заменял элемент на индексе index
}