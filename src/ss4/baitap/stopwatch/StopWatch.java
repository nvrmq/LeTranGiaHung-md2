package ss4.baitap.stopwatch;

import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long endTime;
    private boolean running = false;
    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
        this.running = false;
    }
    public long elapsedTime() {
        long elapsed;
        if (this.running) {
            elapsed = System.currentTimeMillis() - this.startTime;
        } else {
            elapsed = this.endTime - this.startTime;
        }
        return elapsed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Enter 1 to start---");
        int a = sc.nextInt();

        StopWatch sw = new StopWatch();
        while (a != 1) {
            a = sc.nextInt();
        }
        if (a == 1) {
            sw.start();
        }

        System.out.println("---Enter 2 to stop at any monent---");
        int b = sc.nextInt();
        while (b != 2) {
            b = sc.nextInt();
        }
        if (b == 2){
            sw.stop();
        }

        System.out.println("---Enter 3 to get time---");
        int c = sc.nextInt();
        if (c == 3){
            System.out.println(sw.elapsedTime()+" miliseconds");
        }
    }
}
