//Вычислить n-ое треугольного число(сумма чисел от 1 до n)
package seminar1.tasks;

public class Task1 {
    public static int calculateTriangularNumber (int n) {
        int triangular = n * (n + 1) / 2;
        return triangular;
    }
}