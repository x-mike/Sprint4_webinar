
public class LinkedList<T>{

    static class Node<T> {

        T data;
        Node<T> next;

        // Constructor
        Node(T t) {
            data = t;
            next = null;
        }
    }

    // домашнее задание
    // 1. добавить метод public void insert(T data), который бы вставлял новый Node в конец списка
    // 2. реализовать интерфейс Iterable<T> (class LinkedList<T> implements Iterable<T>)
    // 3. Добавить методы removeFirst() и removeLast() которые удаляют первый и последний элемент соотвественно
    // 4. Добавить метод insertByIndex(int index, T data), который бы заменял элемент на индексе index
}
