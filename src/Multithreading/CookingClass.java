package Multithreading;

import Multithreading.CookingClass;

public class CookingClass extends Thread {
    private String task;

    public CookingClass(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " is running" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        CookingClass class1 = new CookingClass("Chopping vegetables");
        CookingClass class2 = new CookingClass("Boiling water");
        Thread thread1 = new Thread(() -> class1.run());
        Thread thread2 = new Thread(() -> class2.run());
        thread1.start();
        thread2.start();
    }
}