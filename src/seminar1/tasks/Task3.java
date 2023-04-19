//Вывести все простые числа от 1 до 1000

package seminar1.tasks;

public class Task3 {
    public static void showSimpleNumbers (int upto) {
        for (int i = 1; i <= upto; i++) {
            boolean isSimple = true;
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++){
                if ((i % j) == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple){
                System.out.print(i + " ");
            }
        }

    }
}