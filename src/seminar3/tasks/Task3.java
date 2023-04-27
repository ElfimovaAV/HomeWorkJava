/*Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
 */

package seminar3.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void countPlanets (ArrayList<String> planets) {

        ArrayList<Integer> countPlanets = new ArrayList<>();
        ArrayList<String> resultList = new ArrayList<>();
        for (String planet: planets) {
            int position = resultList.indexOf(planet);
            if(position >= 0) {
                countPlanets.set(position, countPlanets.get(position) +1);
            } else {
                resultList.add(planet);
                countPlanets.add(1);
            }
        } printPlanetCount(resultList, countPlanets);


    }

    public static void printPlanetCount (List<String> planets, List<Integer> counts) {
        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("%-10s : %3d%n", planets.get(i), counts.get(i));
        }
    }

}
