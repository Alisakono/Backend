package org.example.homework_11_03_24;

import java.util.*;

public class Task {
    /* Имеется заданный список имен студентов:
     List names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""));
     С помощью итератора:
     a). Вывести имена, состоящие из 4 букв
     b). Удалить из списка null и пустые строки.
     С помощью listIterator:
     c). Удалить из списка все имена, начинающиеся на "T"
     d). Заменить в списке "Ann" на "student Ann" */
    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>(Arrays.asList("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""));
        Iterator<String> iterator = namesList.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name != null && name.length() == 4) {

                System.out.println(name);
            }
        }
        iterator = namesList.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (Objects.equals(name, null) || name.isEmpty()) {
                iterator.remove();

            }
        }
        System.out.println(namesList);

        ListIterator<String> listIterator = namesList.listIterator();
        while (listIterator.hasNext()) {
            String current = listIterator.next();
            if (!current.startsWith("T")) {
                listIterator.remove();
                System.out.println(current);
            }
        }
        listIterator = namesList.listIterator();
        listIterator.add("Mary");
        listIterator.add("Jane");
        listIterator.add("Mark");
        listIterator.add("Ann");
        listIterator.previous();
        listIterator.set("Student Ann");
        System.out.println(namesList);

    }
}






