package org.example.homework_13_03_24;

import java.util.List;

public class LinkedList {
 /* 1. Перебрать LinkedList и найти самую короткую строку.
    2 Перебрать LinkedList и объединить все строки в одну с использованием разделителя "|".*/

    public static void main(String[] args) {

        java.util.LinkedList<String> lines = new java.util.LinkedList<>(List.of("Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"));
        String minLine = null;
        for (String line : lines) {
            if (minLine == null || line.length() < minLine.length()) {
                minLine = line;
            }
        }

        System.out.println(minLine);

        lines = new java.util.LinkedList<>(lines);
        String combinedString = String.join("|", lines);
        System.out.println(combinedString);

    }
}


