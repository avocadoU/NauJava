package com.example;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        Task timer = new Timer(5);
        timer.start();

        Thread.sleep(3000);
        timer.stop();
    }
}

class Timer implements Task {
    private int seconds;
    private boolean running;

    public Timer(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void start() {
        running = true;
        new Thread(() -> {
            while (running && seconds > 0) {
                System.out.println("Осталось: " + seconds);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
                seconds--;
            }
            if (seconds == 0) {
                System.out.println("Время вышло!");
            }
        }).start();
    }

    @Override
    public void stop() {
        running = false;
    }
}

interface Task {
    void start();
    void stop();
}
