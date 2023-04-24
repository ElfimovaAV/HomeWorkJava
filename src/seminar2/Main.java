package seminar2;

import seminar2.tasks.Task0;
import seminar2.tasks.Task1;
import seminar2.tasks.Task2;

public class Main {
    public static void main(String[] args) {
        System.out.println(Task0.findJewelsInStones("aB", "aaaAbbbB"));

        final int[] index = new int[] {2,1,0};
        System.out.println(Task1.shuffle("cba", index));

        Task2.replaceAllergens();
    }
}
