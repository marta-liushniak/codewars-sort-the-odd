package codewars;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(
                new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));
    }

    public static int[] sortArray(int[] array) {
        int[] odds = Arrays
                .stream(array)
                .filter(n -> n % 2 != 0)
                .sorted()
                .toArray();

        /* This part of the code is responsible for replacing the odd numbers
        in the original array with the sorted odd numbers from odds.
        If it is an odd number, then we replace it with the next smallest odd number in odds.
         */
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = odds[j++];
            }
        }
        return array;
    }
}
