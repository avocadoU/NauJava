package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n\u001B[35m-------ВЫБЕРИТЕ ЗАДАНИЕ-------\u001B[0m");
            System.out.println("1 - Task1 (Работа с массивом)");
            System.out.println("2 - Task2 (Работа со списками)");
            System.out.println("3 - Task3 (Stream API)");
            System.out.println("4 - Task4 (HTTP клиент и JSON)");
            System.out.println("5 - Task5 (Реализация интерфейса)");
            System.out.println("0 - Выход");
            System.out.print("Ваш выбор: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Task1.main(new String[0]);
                    break;
                case "2":
                    Task2.main(new String[0]);
                    break;
                case "3":
                    Task3.main(new String[0]);
                    break;
                case "4":
                    Task4.main(new String[0]);
                    break;
                case "5":
                    Task5.main(new String[0]);
                    break;
                case "0":
                    System.out.println("Выход...");
                    return;
                default:
                    System.out.println("Такого нет в списке! Попытайтесь снова");
            }
        }
    }
}
