// Сортировка выбором
package uz.coder.algorithm;

import java.util.Arrays;
import java.util.Random;

public class SortByChoice {
    public static void main(String[] args) {
        int[] unSortedArray = new int[15];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            unSortedArray[i] = random.nextInt(100);
        }

        System.out.println("Unsorted array: " + Arrays.toString(unSortedArray));

        for (int i = 0; i < unSortedArray.length; i++) {
            int min = unSortedArray[i];
            int indexMin = i;

            for (int j = i + 1; j < unSortedArray.length; j++) {
                if (unSortedArray[j] < min) {
                    min = unSortedArray[j];
                    indexMin = j;
                }
            }

            if (i != indexMin) {
                int temp = unSortedArray[i];
                unSortedArray[i] = unSortedArray[indexMin];
                unSortedArray[indexMin] = unSortedArray[temp];
            }
            System.out.println(unSortedArray[i] + " ");
        }
    }
}
