package Multithreading;

public class CookingJob {
    private String task;

    public CookingJob(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " is running" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        CookingJob job1 = new CookingJob("Chopping vegetables");
        CookingJob job2 = new CookingJob("Boiling water");
        Thread thread1 = new Thread(() -> job1.run());
        Thread thread2 = new Thread(() -> job2.run());
        thread1.start();
        thread2.start();
    }
}
