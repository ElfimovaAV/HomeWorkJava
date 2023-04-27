/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое
из этого списка. Collections.max()
 */

package seminar3.tasks;

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
    public static void findMaxValue(ArrayList<Integer> integer_list) {
        int max = Collections.max(integer_list);
        System.out.println("Max number: " + max);
    }

    public static void findMinValue(ArrayList<Integer> integer_list) {
        int min = Collections.min(integer_list);
        System.out.println("Min number: " + min);
    }

    public static void findAverage (ArrayList<Integer> integer_list) {
        float sum = 0;
        for (int i = 0; i < integer_list.size(); i++) {
            sum += integer_list.get(i);
        }
        float average = sum / integer_list.size();
        System.out.println("Average: " + average);
    }
}
