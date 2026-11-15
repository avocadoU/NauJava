package com.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        Random random = new Random();

        int[] array = random.ints(size, -100, 101).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.stream(array).max().getAsInt());
    }
}
