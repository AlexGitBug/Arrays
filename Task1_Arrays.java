package Task.House.Task1;

/**
 * Задание 1
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * <p>
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
 */

import java.util.Arrays;

public class Task1_Arrays {


    public static void main(String[] args) {

        int[] values = {3, 5, -6, 3, 2, -9, 0, -123};
        int[] resultArray = fillArray(values);
        System.out.print(Arrays.toString(resultArray));

    }

    public static int countPostive(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] fillArray(int[] values) {
        int[] result = new int[countPostive(values)];
        int currentIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                result[currentIndex] = values[i] * countPostive(values);
                currentIndex++;
            }
        }
        return result;
    }
}

