package org.example.homework_25_03_24;

import java.util.LinkedList;

/* 3.   На основе библиотечного класса LinkedList реализовать такую структуру данных, как стек:
Создать класс CustomStack с методами push(), pop(), peek(). Протестировать работу класса.*/
public class CustomStack<I extends Number> {
    private LinkedList<Integer> stack;

    public CustomStack() {
        stack = new LinkedList<>();
    }


    public void push(Integer integer) {
        stack.addFirst(integer);

    }

    public Integer pop() {

        return stack.removeFirst();
    }

    public Integer peak() {

        return stack.getFirst();
    }

    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<Integer>();
        stack.push(1);
        stack.push(3);
        stack.push(6);

        System.out.println(stack.peak());
        System.out.println(stack.pop());
        System.out.println(stack.peak());

    }
}
