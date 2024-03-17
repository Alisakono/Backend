package org.example.homework_13_03_24;

import java.util.LinkedList;
import java.util.List;

public class NewList {
     /* 4 Напишите метод, чтобы получить первое и последнее вхождение указанных элементов
    в связанном списке.
            input:
    list = {1, 4, 3, 2, 1, 2, 2, 0}, element = 2
    output:
            3 (индекс первого вхождения), 6 (индекс последнего вхождения)*/
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>(List.of(1, 4, 3, 2, 1, 2, 2, 0));
        int element = 2;
        int[] result = findFirstAndLastIndex(list, element);
        System.out.println("Индекс первого вхождения "+result[0]);
        System.out.println("Индекс последнего вхождения "+result[1]);

    }

    private static int[] findFirstAndLastIndex(LinkedList<Integer> list, int element) {
        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == element) {
                firstIndex = i;
                break;
            }
        }
      for (int i = list.size()-1; i>=0; i--) {
          if (list.get(i) == element) {
              lastIndex = i;
              break;
          }

      }
        return new int[]{firstIndex, lastIndex};
    }
}