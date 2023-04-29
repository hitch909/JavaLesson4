
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void),
// который вернет “перевернутый” список.

import java.util.Collections;
import java.util.LinkedList;

public class task01 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            myList.add(newRandomNumber());
        }
        System.out.println ("\nElements before the reverse: " + myList);
        Collections.reverse(myList);
        System.out.print("\nElements after reversing: " + myList);
    }

    public static int newRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}

