package by.techmeskills;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskSecond {
    public static void main(String[] args) {
        /*
        Создайте массив целых чисел.
        Удалите все вхождения заданного числа из массива.
        Пусть число задается с консоли (класс Scanner).
        Если такого числа нет - выведите сообщение об этом.
        В результате должен быть новый массив без указанного числа.
         */

        // создадим массив с рандомными числами
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(numbers)); //- проверим какие числа входят в массив

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для удаления из массива: ");
        int numberRemoval = scanner.nextInt();

        //зададим условие для индекса
        int indexOfNumber = 0;
        for (int number : numbers) {
            if (number == numberRemoval) {
                indexOfNumber++;
            }
        }

        if (indexOfNumber == 0) {
            System.out.println(numberRemoval + " такого числа нет");
        } else {
            int newLengthNumber = numbers.length - indexOfNumber;
            int [] numberNotRemoval = new int[newLengthNumber];
            for (int i = 0, j = 0; i < numbers.length; i++) {
                if (numbers[i] != numberRemoval) {
                    numberNotRemoval[j] = numbers[i];
                    j++;
                }
            }
            System.out.println("Исходный массив " + Arrays.toString(numbers));
            System.out.println("Измененный массив " + Arrays.toString(numberNotRemoval));
        }
    }
}
