package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static int n;

    public static void main(String[] args) {
        System.out.println("Введите размер ArrayList: ");
        n = new Scanner(System.in).nextInt();
        ArrayList<Double> randomList = createRandomList();
        mergeSort(randomList);
        System.out.println(Arrays.asList(randomList));
    }

    public static void mergeSort(ArrayList<Double> list) {
        if (list == null || list.size() <= 1) {
            return;
        }

        ArrayList<Double> temp = new ArrayList<>(list); // Временный список
        mergeSort(list, temp, 0, list.size() - 1);
    }

    private static void mergeSort(ArrayList<Double> list, ArrayList<Double> temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(list, temp, left, mid);
            mergeSort(list, temp, mid + 1, right);

            merge(list, temp, left, mid, right);
        }
    }

    private static void merge(ArrayList<Double> list, ArrayList<Double> temp, int left, int mid, int right) {

        for (int i = left; i <= right; i++) {
            temp.set(i, list.get(i));
        }

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (temp.get(i) <= temp.get(j)) {
                list.set(k, temp.get(i));
                i++;
            } else {
                list.set(k, temp.get(j));
                j++;
            }
            k++;
        }

        while (i <= mid) {
            list.set(k, temp.get(i));
            i++;
            k++;
        }
    }

    public static ArrayList<Double> createRandomList() {
        ArrayList<Double> randomList = new ArrayList<>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            randomList.add(random.nextDouble());
        }

        return randomList;
    }
}
