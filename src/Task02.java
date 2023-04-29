//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(10);
            myQueue.add(a);
        }
        System.out.print("Array: " + myQueue);
        myQueue.add(123);
        System.out.println("\nArray: " +myQueue);

        Deque<Integer> mydDeque = new ArrayDeque<>(myQueue);

        System.out.println(mydDeque.pop());
        System.out.println("Array: " +mydDeque);
        System.out.println(mydDeque.getFirst());
        System.out.println("Array: " +mydDeque);
    }
}
