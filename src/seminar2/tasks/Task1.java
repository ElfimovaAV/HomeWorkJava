// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”

package seminar2.tasks;

public class Task1 {
    public static String shuffle(final String s, final int[] index) {

        char[] chars = s.toCharArray();
        char[] shufflechars = new char[chars.length];

        for (int i = 0; i < index.length; i++) {
            shufflechars[index[i]] = chars[i];
        }
        return new String(shufflechars);
    }
}
