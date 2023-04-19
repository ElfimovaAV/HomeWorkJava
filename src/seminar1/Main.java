package seminar1;

import seminar1.tasks.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        // Task1. Вычисление n-ого треугольного числа
        System.out.printf("Введите натуральное число n: ");
        int number = Integer.parseInt(iScanner.next());

        int res = Task1.calculateTriangularNumber(number);
        System.out.println("n-ое треуг.число: " + res);

        // Task2. Вычисление n!
        int answer = Task2.calculateFactorial(number);
        System.out.println("Факториал числа n: " + answer);

        //Task3. Вывод простых чисел
        Task3.showSimpleNumbers(1000);
        System.out.println();

        //Task4. Простой калькулятор
        System.out.print("Введите первое число: ");
        int numb1 = Integer.parseInt(iScanner.next());

        System.out.print("Введите оператор действия: ");
        String sign = iScanner.next();

        System.out.print("Введите второе число: ");
        int numb2 = Integer.parseInt(iScanner.next());

        Task4.calculate(numb1, sign, numb2);

        //Task5. Решение уравнения
        Task5.findUnknownNumbers(2, 5, 69);

        //Task6. Сумма элементов массива с четными индексами
        System.out.print("Введите количество элементов массива: ");
        int length = Integer.parseInt(iScanner.next());
        int[] array1 = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            array1[i] = Integer.parseInt(iScanner.next());
        }

        System.out.println(Arrays.toString(array1));
        Task6.sumEvenNumberedElements(array1);

        //Task7. Вывод уникальных элементов массива.
        int[] arr = new int[]{1, 2, 2, 3, 4, 4, 5, 5, 6};
        Task7.findUniqElements(arr);










    }
}