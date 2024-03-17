package org.example.homework_13_03_24;

import java.util.Iterator;
import java.util.LinkedList;

public class ClassMain {
    public static void main(String[] args) {
        LinkedList<MyClass> list = new LinkedList<>();
        list.add(new MyClass("Eugen",4));
        list.add( new MyClass("Wladimir",4));
        list.add(new MyClass( "Eugenia",1));
        list.add(new MyClass("Mariya",1));
        list.add(new MyClass("Irina",2));
        list.add(new MyClass( "Alica",2));

        Iterator<MyClass> iterator = list.iterator();
        while (iterator.hasNext()) {
            MyClass myClass = iterator.next();
            if (myClass.getId()!=1) {
                iterator.remove();
                System.out.println(myClass);
            }

        }

    }
}
