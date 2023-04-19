/*Дан список. Выведите те его элементы, которые встречаются в списке только один раз.
Элементы нужно выводить в том порядке, в котором они встречаются в списке.
        Входные данные
        Вводится список чисел. Все числа списка находятся на одной строке.
        Выходные данные
        Выведите ответ на задачу.
        Sample Input:
        6
        1
        2
        2
        3
        3
        3
        Sample Output:
        1*/

package seminar1.tasks;

public class Task7 {
    public static void findUniqElements(int[] array) {
        System.out.print("Элементы, которые встречаются в массиве только один раз: ");
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++)
                if (array[i] == array[j])
                    count++;

            if (count == 1)
                System.out.print(array[i] + " ");
        }
    }
}
