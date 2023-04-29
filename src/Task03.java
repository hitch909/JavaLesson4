// В калькулятор добавьте возможность отменить последнюю операцию.

//Реализовать простой калькулятор


import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Task03 {
    public static void main(String[] args)throws IOException {
        int x;
        int y;
        char op;
        int res = 0;
        Deque<Integer> mydDeque = new ArrayDeque<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);

            if (mydDeque.size() == 0) {
                System.out.print("введите х= ");
                x = scanner.nextInt();
            } else {
                x = last(mydDeque);  // x становится результатом послед. операции
            }

            System.out.print("введите y= ");
            y = scanner.nextInt();
            System.out.print("\nвведите оператор (+, -, *, /): ");
            op = scanner.next().charAt(0);

            while (true) {
                if (op == '+') {
                    res = x + y;
                }
                if (op == '-') {
                    res = x - y;
                }
                if (op == '*') {
                    res = x * y;
                }
                if (op == '/') {
                    res = x / y;
                }
                break;
            }
            System.out.println(x + " " + op + " " + y + " = " + res);
            mydDeque.add(res);
            System.out.println("list of results: " + mydDeque);
        }
    }
    public static int last(Deque<Integer> mydDeque) {  //возвращаем число последнего результата
        int num = mydDeque.peekLast();
        return num;
    }
}

