package by.techmeskills;

import java.util.Arrays;
import java.util.Random;

public class TaskFourth {
    public static void main(String[] args) {
        /*
        Создайте 2 массива из 5 чисел.
        Выведите массивы на консоль в двух отдельных cтроках.
        Посчитайте среднее арифметическое элементов каждого массива и сообщите,
        для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
         */

        // создадим 1 массив с рандомными числами
        int[] arrayFirst = new int[5];
        for (int i = 0; i < arrayFirst.length; i++) {
            Random random = new Random();
            arrayFirst[i] = random.nextInt(100);
        }
        System.out.println("Первый массив: " + Arrays.toString(arrayFirst)); //- проверим какие числа входят в 1 массив

        // создадим 2 массив с рандомными числами
        int[] arraySecond = new int[5];
        for (int i = 0; i < arraySecond.length; i++) {
            Random random = new Random();
            arraySecond[i] = random.nextInt(100);
        }
        System.out.println("Второй массив: " + Arrays.toString(arraySecond)); //- проверим какие числа входят в 2 массив

        int sum1 = 0;
        for (int j : arrayFirst) {
        //for (int i = 0; i < arrayFirst.length; i++) {
            sum1 = sum1 + j;
        }
        double numberAverage1 = (double) sum1 / arrayFirst.length;

        int sum2 = 0;
        for (int j : arraySecond) {
            //for (int i = 0; i < arraySecond.length; i++) {
            sum2 = sum2 + j;
        }
        double numberAverage2 = (double) sum2 / arraySecond.length;

        if (numberAverage1 > numberAverage2) {
            System.out.println("Среднее арифметическое 1 массива равное " + numberAverage1 + " больше, чем среднее арифметическое 2 массива равное " + numberAverage2);
        } else if (numberAverage1 < numberAverage2) {
            System.out.println("Среднее арифметическое 1 массива равное " + numberAverage1 + " меньше, чем среднее арифметическое 2 массива равное " + numberAverage2);
        } else { //(numberAverage1 == numberAverage2)
            System.out.println("Среднее арифметические массивов 1 и 2 равны");
        }
    }
}
