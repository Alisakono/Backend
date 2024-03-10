package org.example.homework;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.list;

public class MyInteger {
 /* 3 у вас есть список значений Integer, вы должны вернуть их сумму
  4 у вас есть список значений Integer, вы должны вернуть их максимум
  6  Написать метод, который проверяет, является ли список Integer отсортированным.
  7  Написать метод, который выдает из исходного списка список всех значений,
   делящихся на заданное число q.*/


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(sum(list));

        System.out.println(max(list));

        System.out.println(isSorted(list));

        System.out.println(myList(list));

    }

    public static boolean isSorted(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static int max(List<Integer> list) {
        int max = 0;
        for (Integer integer : list) {
            if (integer > max) {
                max = integer;
            }
        }
        return max;
    }

    public static int sum(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }

    public static List<Integer> myList(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        int q = 2;
        for (Integer integer : list) {
            if (integer % q == 0) {
                result.add(integer);
            }
        }
        return result;
    }
}



