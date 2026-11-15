package com.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        Random random = new Random();

        ArrayList<Double> list = random.doubles(size, -100, 100)
                .map(n -> Math.round(n * 100.0) / 100.0)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(list);

        mergeSort(list);

        System.out.println(list);
    }

    private static void mergeSort(ArrayList<Double> list) {
        if (list.size() < 2) return;

        int mid = list.size() / 2;

        ArrayList<Double> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Double> right = new ArrayList<>(list.subList(mid, list.size()));

        mergeSort(left);
        mergeSort(right);

        merge(list, left, right);
    }

    private static void merge(ArrayList<Double> result, ArrayList<Double> left, ArrayList<Double> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.set(k++, left.get(i++));
            } else {
                result.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            result.set(k++, left.get(i++));
        }
        while (j < right.size()) {
            result.set(k++, right.get(j++));
        }
    }
}
