/*На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится
n строк - строки книги. потом вводится натуральное число m - количество продуктов, на которые
у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт,
на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1.
Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами.
Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

        Выходные данные
        Замените все продукты в поваренной книге Васи и выведите их построчно на экран.
        На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить написан
        с большой буквы, то и замена тоже должна начинаться с большой буквы!

        Sample Input:

        2
        Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его.
        Посыпьте измельчённый арахис на мороженое.
        Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
        3
        арахис - колбаса
        клубника - вишня
        сгущенка - молоко

        Sample Output:

        Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его.
        Посыпьте измельчённый колбаса на мороженое.
        Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.*/


package seminar2.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    static Scanner iscanner = new Scanner(System.in);

        public static List<String> chooseRecipes () {
        System.out.printf("How many recipes to choose: ");
        int n = Integer.parseInt(iscanner.next());
        List<String> recipesList = new ArrayList<>();
        System.out.println("Enter the recipes: ");
        while(recipesList.size() <= n){
            recipesList.add(iscanner.nextLine());
        }
        recipesList.removeAll(Arrays.asList("", null));
        return recipesList;
    }
    public static void replaceAllergens() {
        List<String> recipesList = chooseRecipes ();
        System.out.printf("How many allergens do you have: ");
        int m = Integer.parseInt(iscanner.nextLine());
        List<String> product1 = new ArrayList<>();
        List<String> product2 = new ArrayList<>();
//            char ch[]=new char[m*2];
        for (int i = 0; i < m; i++) {
            System.out.printf("Enter allergen and replacement: ");
            String[] prods = iscanner.nextLine().split("-");
            product1.add(prods[0].trim());
            product2.add(prods[1].trim());
        }
        iscanner.close();
        for (int i = 0, size = product1.size(); i < size; i ++) {
            product1.add(product1.get(i).substring(0, 1).toUpperCase()+product1.get(i).substring(1));
            product2.add(product2.get(i).substring(0, 1).toUpperCase()+product2.get(i).substring(1));
        }
        System.out.println(product1);
        System.out.println(product2);

        List<String> recipesListNew = new ArrayList<>();
        for (int i = 0; i < recipesList.size(); i ++) {
            String recipe = recipesList.get(i);
            for (int j = 0; j < product1.size(); j ++)
                recipe = recipe.replaceAll(product1.get(j), product2.get(j));
            recipesListNew.add(recipe);
        }
        System.out.println(recipesListNew);
    }
}



