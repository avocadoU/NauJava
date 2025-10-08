package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static int size;

    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        size = new Scanner(System.in).nextInt();

        int[] randomArray = createRandomArray();
        int maxAbsValue = getMaxAbsValue(randomArray);
        System.out.println(String.format("Рандомный массив: %s", Arrays.toString(randomArray)));
        System.out.println(String.format("Наибольшее число по модулю: %d", maxAbsValue));
    }


    public static int getMaxAbsValue(int[] array) {
        int maxValue = Integer.MIN_VALUE;

        for (int value : array) {
            maxValue = Math.max(maxValue, value);
        }

        return maxValue;
    }

    public static int[] createRandomArray() {
        Random random = new Random();
        int[] randomArray = new int[size];

        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextInt();
        }

        return randomArray;
    }
}