package seminar3;

import seminar3.tasks.Task1;
import seminar3.tasks.Task2;
import seminar3.tasks.Task3;
import seminar3.tasks.Task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list_numb = new ArrayList<>();
        list_numb.add(15);
        list_numb.add(22);
        list_numb.add(41);
        list_numb.add(56);
        list_numb.add(2);
        list_numb.add(33);
        list_numb.add(142);
        System.out.println(list_numb);
        Task1.delEvenNumbFromList(list_numb);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(19);
        list1.add(45);
        list1.add(71);
        list1.add(23);
        list1.add(52);
        list1.add(11);
        list1.add(4);
        System.out.println(list1);
        Task2.findMaxValue(list1);
        Task2.findMinValue(list1);
        Task2.findAverage(list1);

        ArrayList<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Earth");
        Task3.countPlanets(planets);

        int[] input_array = { 5, 1, 6, 2, 3, 4 };
        System.out.println(Arrays.toString(Task4.mergesort(input_array)));
    }
}
