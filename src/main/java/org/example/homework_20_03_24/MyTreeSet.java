package org.example.homework_20_03_24;

import javax.xml.crypto.Data;
import java.util.*;

public class MyTreeSet {
    /* 1. Создать TreeSet. Из него:
     Найти заданное число 10, самое большое, самое маленькое
     Вывести все четные числа
     Получить список всех чисел в обратном порядке
     Получить список всех чисел меньше 7*/
    public static void main(String[] args) {
        TreeSet<Integer> integerSet = new TreeSet<>();
        integerSet.add(2);
        integerSet.add(10);
        integerSet.add(21);
        integerSet.add(-1);
        integerSet.add(5);
        integerSet.add(9);
        integerSet.add(13);
        integerSet.add(81);
        integerSet.add(14);
        System.out.println(integerSet);

        System.out.println("Заданное число 10:"+integerSet.contains(10));
        System.out.println("Максимальное число = "+Collections.max(integerSet));
        System.out.println("Минимальное число = "+Collections.min(integerSet));

        for (int num : integerSet) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        TreeSet<Integer> descendingSet = (TreeSet<Integer>) integerSet.descendingSet();
        for (Integer integer : descendingSet) {
            System.out.print(integer + " ");
        }
        System.out.println();
        for (int num : integerSet) {
            if (num < 7) {
                System.out.print(num + " ");
            }
        }

    }
}
