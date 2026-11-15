package com.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        executeTask1(scanner);
    }

    private static void executeTask1(Scanner scanner) {
        int size = scanner.nextInt();
        Random random = new Random();

        int[] array = random.ints(size, -100, 101).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.stream(array).max().getAsInt());
    }
}