package by.techmeskills;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskThird {
    public static void main(String[] args) {
        /*
        Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
        Для генерации случайного числа используйте метод Math.random().
        Пусть будет возможность создавать массив произвольного размера.
        Пусть размер массива вводится с консоли.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int lengthArray = scanner.nextInt();

        int[] numbers = new int[lengthArray];
        int min = 0;
        int max = 100;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (max - min));
        }
        System.out.println("Массив " + Arrays.toString(numbers)); //- проверим какие числа входят в массив

        // максимальное, минимальное и среднее значение.
        int numberMax = numbers[0];
        int numberMin = numbers[0];
        int numberAverage = 0;
        for (int i = 0; i < numbers.length; i++) {
            // посчитаем макс
            if (numbers[i] > numberMax) {
                numberMax = numbers[i];
            }
            // посчитаем мин
            if (numbers[i] < numberMin) {
                numberMin = numbers[i];
            }
        }
        System.out.println("Максимальное значение: " + numberMax);
        System.out.println("Минимальное значение: " + numberMin);

        // среднее
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        numberAverage = sum / numbers.length;
        System.out.println("Среднее значение: " + numberAverage);
    }
}




