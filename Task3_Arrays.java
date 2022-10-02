package Task.House.Task1;

/**
 * Задание 3
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 */
public class Task3_Arrays {

    public static void main(String[] args) {

        int[] values = {-4, 0, 1, 9, 18, 0, 3, 15};
        int[] positiveResult = dividePositiveArray(values);
        int[] negativeResult = divideNegativeArray(values);
        int[] zeroResult = divideZeroArray(values);
        fillDoubleArray(positiveResult, negativeResult, zeroResult);

    }

    public static int[][] fillDoubleArray(int[] result, int[] result1, int[] result2) {
        int[][] resultArray = new int[3][];
        resultArray[0] = result;
        resultArray[1] = result1;
        resultArray[2] = result2;
        printArray(resultArray);
        return resultArray;
    }

    public static void printArray(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            int[] ints = values[i];
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] dividePositiveArray(int[] values) {
        int[] result = new int[countPositiveNumber(values)];
        int currentIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                result[currentIndex] = values[i];
                currentIndex++;
            }
        }
        return result;
    }
    public static int[] divideNegativeArray(int[] values) {
        int[] result = new int[countZeroNumber(values)];
        int currentIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) {
                result[currentIndex] = values[i];
                currentIndex++;
            }
        }
        return result;
    }
    public static int[] divideZeroArray(int[] values) {
        int[] result = new int[countNegativeNumber(values)];
        int currentIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) {
                result[currentIndex] = values[i];
                currentIndex++;
            }
        }
        return result;
    }

    public static int countPositiveNumber(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static int countZeroNumber(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countNegativeNumber(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) {
                count++;
            }
        }
        return count;
    }
}
