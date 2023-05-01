/*Реализуйте очередь с помощью LinkedList со следующими методами:
        • enqueue() — помещает элемент в конец очереди,
        • dequeue() — возвращает первый элемент из очереди и удаляет его,
        • first() — возвращает первый элемент из очереди, не удаляя.*/
package seminar4.tasks;

import java.util.LinkedList;

public class Task2 {

    // enqueue() — помещает элемент в конец очереди
    public static void enqueue(LinkedList<String> TestLinkedList, String elem) {
        TestLinkedList.addLast(elem);
        System.out.println(TestLinkedList);
    }

    // dequeue() — возвращает первый элемент из очереди и удаляет его
    public static String dequeue(LinkedList<String> TestLinkedList) {

        return TestLinkedList.removeFirst();

    }

    // first() — возвращает первый элемент из очереди, не удаляя
    public static String first(LinkedList<String> TestLinkedList) {

        return TestLinkedList.getFirst();

    }
}