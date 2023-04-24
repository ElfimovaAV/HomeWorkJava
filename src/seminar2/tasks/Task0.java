// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

package seminar2.tasks;

public class Task0 {
    public static String findJewelsInStones(String jewels, String stones) {
        StringBuilder result = new StringBuilder();

        for (char jewel : jewels.toCharArray()) {
            int count = 0;
            for (char stone : stones.toCharArray()) {
                if (stone == jewel) {
                    count++;
                }
            }
            result.append(jewel).append(count);
        }

        return result.toString();
    }
}
