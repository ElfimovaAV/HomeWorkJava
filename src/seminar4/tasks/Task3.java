//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

package seminar4.tasks;

import java.util.LinkedList;

public class Task3 {

    public static void sumOfElements(LinkedList<Integer> originLinkedList) {
        int sum = 0;
        for (int elem : originLinkedList) {
            sum += elem;
        }
        System.out.println(sum);
        System.out.println(originLinkedList);
    }
}
