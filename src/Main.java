import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Рекурсивное вычисление чисел Фибоначчи

        System.out.println(fibonacciValue(10));

    }
    public static int fibonacciValue(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacciValue(num - 1) + fibonacciValue(num - 2);
        }
    }
}
