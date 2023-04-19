//Вычислить n! (произведение чисел от 1 до n)
package seminar1.tasks;

public class Task2 {
    public static int calculateFactorial (int number) {
        if (number == 0) return 1;
        if (number == 1) return number;
        return (number * calculateFactorial(number - 1));
    }
}