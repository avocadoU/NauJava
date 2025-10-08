package org.example;

import java.lang.Thread;

public class Task5 {

    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer(10L);
        timer.start();

    }
}

class Timer implements Task {

    private Long timerValue;

    public Timer() {

    }

    public Timer(Long timerValue) {
        this.timerValue = timerValue;
    }

    @Override
    public void start() throws InterruptedException {
        System.out.println("Таймер запущен на " + timerValue + " с.");
        System.out.println("---------------------------------------");
        while (timerValue > 0) {
            timerValue--;
            System.out.println("Осталось: " + timerValue + " с.");
            Thread.sleep(1000);
        }
        System.out.println("Таймер завершился успешно");
    }

    @Override
    public void stop() {
        System.out.println("Таймер предварительно остановлен на " + timerValue + " с.");
        timerValue = 0L;

    }

    public void setTimerValue(Long timerValue) {
        this.timerValue = timerValue;
    }

    public Long getTimerValue() {
        return timerValue;
    }
}

interface Task {

    void start() throws InterruptedException;

    void stop();
}