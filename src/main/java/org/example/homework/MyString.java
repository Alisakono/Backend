package org.example.homework;

import java.util.ArrayList;
import java.util.List;

public class MyString {
    /* 1 У вас есть список значений String, вы должны вернуть список количества символов этих String
       2 у вас есть список значений String, вы должны вернуть список со всеми значениями String
         более трех символов
       5  у вас есть список String, вы должны вернуть максимальную длину String*/
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        strings.add("Five");
        strings.add("Six");
        strings.add("Seven");
        for (String string : strings) {
            System.out.println(string.length());

        }
        for (String string : strings) {
            if (string.length() > 3) {
                System.out.println(string);

            }
        }
        int max = 0;
        for (String string : strings) {
            if (string.length() > max) {
                max = string.length();
            }
        }
        System.out.println(max);
    }
}
