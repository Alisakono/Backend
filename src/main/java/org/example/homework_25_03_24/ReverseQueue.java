package org.example.homework_25_03_24;

import java.util.*;

public class ReverseQueue {
    /* 2.  Имеется очередь Queue. Написать метод, возвращающий очередь Queue,
       в которой элементы расположены в обратном порядке.*/
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");

        System.out.println(queue);

        Queue<String> reversedQueue = reverseQueue(queue);

        while (!reversedQueue.isEmpty()){
            System.out.println(reversedQueue.poll() + " ");
        }

    }
    private static Queue<String> reverseQueue(Queue<String> queue) {
        Stack<String> stack = new Stack<>();

        while (!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()){
            queue.offer(stack.pop());
        }
        return queue;
    }
}
