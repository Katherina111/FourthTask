package by.techmeskills;

//import java.util.Scanner;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskFirst {
    public static void main(String[] args) {
        /*
        Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том,
        входит ли заданное число в массив или нет.
        Пусть число для поиска задается с консоли (класс Scanner)
         */

        int[] numbers = new int[10];
        int min = 0;
        int max = 100;

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(100);
        }
        //System.out.println(Arrays.toString(numbers)); - проверим какие числа входят в массив

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для поиска: ");
        int numberSearch = scanner.nextInt();


        boolean numberInArray = false;
        for (int number : numbers) {
            if (number == numberSearch) {
                numberInArray = true;
                break;
            }
        }
        System.out.println(numberInArray ? numberSearch + " - Заданное число входит в массив" : numberSearch + " - Заданное число не входит в массив");
    }
}

