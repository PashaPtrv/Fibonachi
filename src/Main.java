import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Реализация чисел Фибоначии через цикл for с пользовательским вводом.
        int maxNumber;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.println("Введите колличество чисел в Фибоначчи:");
        Scanner scanner = new Scanner(System.in);
        maxNumber = scanner.nextInt();
        System.out.print("Фибоначчи для "+maxNumber+" чисел:");

        for (int i = 1; i <= maxNumber; ++i){

            System.out.print(previousNumber+" ");

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }

    }
}
