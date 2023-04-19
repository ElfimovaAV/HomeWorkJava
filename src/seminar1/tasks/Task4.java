//3. Реализовать простой калькулятор
package seminar1.tasks;

public class Task4 {
    public static void calculate(int num1, String operator, int num2) {
        if (operator.equals("+")) {
            double res = num1 + num2;
            System.out.println(res);
        } else if (operator.equals("-")) {
            double res = num1 - num2;
            System.out.println(res);
        } else if (operator.equals("*")) {
            double res = num1 * num2;
            System.out.println(res);
        } else if (operator.equals("/")) {
            double res = (double) num1 / num2;
            System.out.println(res);
        } else {
            throw new RuntimeException("Операция не поддерживается");
        }
    }
}