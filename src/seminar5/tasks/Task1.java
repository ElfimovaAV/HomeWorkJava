/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге.
 */

package seminar5.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public static void fillPhoneBook() {

        addContact("Малюта Скуратов", "89001112323");
        addContact("Борис Годунов", "89012224545");
        addContact("Степан Разин", "89023335656");
        addContact("Григорий Орлов", "89500066412");
        addContact("Емельян Пугачев", "89034446767");
        addContact("Григорий Распутин", "89045557878");
        addContact("Александр Суворов", "89056668989");
        addContact("Георий Жуков", "89067779090");
        addContact("Григорий Орлов", "89078880101");
        addContact("Борис Годунов", "89087223311");
    }


    public static void addContact(String name, String phonenumber) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phonenumber);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(phonenumber);
            phoneBook.put(name, list);
        }
    }

    // Метод, который печатает список контактов
    public static void printPhoneBook() {
        for (Map.Entry<String, ArrayList<String>> item : phoneBook.entrySet()) {
            String phonenumber = "";
            for (String el : item.getValue()) {
                phonenumber = phonenumber + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phonenumber);
        }
    }

    // Метод, который ищет контакт
    public static void findPhoneNumber() {
        boolean flag = true;
        while (flag) {
            try {
                System.out.print("Enter name of contact or write 'out' to stop: ");
                Scanner iscanner = new Scanner(System.in);
                String findName = iscanner.nextLine();
                if (findName.isEmpty()) {
                    throw new RuntimeException("You enter an empty string!");
                }
                if (findName.equals("out")) {
                    break;
                }
                if (!phoneBook.containsKey(findName) && (!findName.equals("out"))) {
                    throw new RuntimeException("Contact is absent");
                }
                if (phoneBook.containsKey(findName) ) {
                    System.out.printf("%s \n", phoneBook.get(findName));
                    flag = false;
                }
            } catch (RuntimeException e) {
                System.out.println("\u001B[43m" + "\u001B[30m" + e.getMessage() + "\u001B[0m");
            }
        }
    }
}

