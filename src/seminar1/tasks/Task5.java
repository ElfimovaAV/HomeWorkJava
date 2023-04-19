/*Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы
одно решение или сообщить, что его нет.*/

package seminar1.tasks;

import java.sql.SQLOutput;

public class Task5 {
    public static void findUnknownNumbers(int q, int w, int e) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((q * 10 + i + j * 10 + w) == e) {
                    System.out.printf("Solution found: " + (q * 10 + i) + "+" + (j * 10 + w) + "=" + e);
                    count += 1;
                }
            }
        }
        if (count == 0) {
            System.out.printf("Solution is not found");
        }
    }
}
