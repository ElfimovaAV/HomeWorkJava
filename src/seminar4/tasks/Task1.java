/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
который вернёет «перевёрнутый» список.*/

package seminar4.tasks;

import java.util.Collections;
import java.util.LinkedList;

public class Task1 {
    public static void reverseLinkedList(LinkedList<String> LinkedListBeforeChanges) {

        Collections.reverse(LinkedListBeforeChanges);
        System.out.println(LinkedListBeforeChanges);

    }
}