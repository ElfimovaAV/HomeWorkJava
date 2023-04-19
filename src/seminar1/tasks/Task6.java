/*Вводится массив (сначала количество элементов, потом сами элементы). Найдите сумму
его элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались.
        Sample Input:
        4
        1
        2
        3
        4
        Sample Output:
        4
        1
        3*/

package seminar1.tasks;

public class Task6 {
    public static void sumEvenNumberedElements (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i+=2) {
            sum += array[i];
        }
        System.out.println("Сумма элементов массива с чётными индексами равна: " + sum);
        System.out.print("Были просуммированы числа: ");
        for (int i = 0; i < array.length; i+=2) {
            System.out.print(array[i] + " ");
        }
    }

}
