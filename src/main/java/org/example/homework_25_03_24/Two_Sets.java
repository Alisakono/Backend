package org.example.homework_25_03_24;

import java.util.HashSet;

       /* Имеется два набора элементов Set. Создать Set, в котором бы находились:
        все элементы из двух наборов,
        только общие для двух наборов элементы,
        только элементы, которые присутствуют в первом наборе и отсутствуют во втором*/
public class Two_Sets {
    public static void main(String[] args) {
        HashSet<Integer> firsSet = new HashSet<>();
        firsSet.add(5);
        firsSet.add(10);
        firsSet.add(15);
        firsSet.add(20);
        firsSet.add(25);

        HashSet<Integer> twoSet = new HashSet<>();
        twoSet.add(4);
        twoSet.add(8);
        twoSet.add(10);
        twoSet.add(16);
        twoSet.add(20);

        HashSet<Integer> fullSet = new HashSet<>(firsSet);
        fullSet.addAll(twoSet);
        System.out.println(fullSet);

        HashSet<Integer> generalSet = new HashSet<>(firsSet);
        generalSet.retainAll(twoSet);
        System.out.println(generalSet);

        HashSet<Integer> fullFirsSet = new HashSet<>(firsSet);
        fullFirsSet.removeAll(twoSet);
        System.out.println(fullFirsSet);
    }
}
