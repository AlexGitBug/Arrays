package Task.House.Task1;

import java.util.Arrays;

/**
 * Задание 2
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только
 * те элементы, которые больше этого среднего арифметического.
 */

public class Task2_Arrays {

    public static void main(String[] args) {

        char[] values = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int[] resultArrayCharToInt = fillArrayFromCharToInt(values);
        System.out.print(Arrays.toString(resultArrayCharToInt));
        System.out.println();
        double resultAverage = findAverageNumberOfArray(values);
        System.out.print("Среднее арифметическое значение " + resultAverage);
        System.out.println();
        findElementsAboveAverageNumber(values);

    }
    public static int[] fillArrayFromCharToInt(char[] values) {
        int[] result = new int[values.length];
        int currentIndex = 0;
        for (int i = 0; i < values.length; i++) {
            result[currentIndex] = (int) values[i];
            currentIndex++;
        }
        return result;
    }
    public static double findAverageNumberOfArray(char[] values) {
        int currentIndex = 0;
        double averageSum = 0;
        for (int i = 0; i < values.length; i++) {
            averageSum += (double) values[i];
            currentIndex++;
        }
        return averageSum / values.length;
    }
    public static void findElementsAboveAverageNumber(char[] values) {
        for (int i = 0; i < values.length; i++) {
            if (findAverageNumberOfArray(values) < (int) values[i]) {
                System.out.print((int) values[i] + " ");
            }
        }
    }
}

