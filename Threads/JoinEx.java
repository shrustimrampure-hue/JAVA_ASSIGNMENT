package Threads;
class MYThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child: " + i);
        }
    }
}

public class JoinEx {
    public static void main(String[] args) {
        MYThread t9 = new MYThread();
        t9.start();
        try {
            t9.join();
        } catch (Exception e) {
        }
        System.out.println("Main Thread Finished!");
//        public static void main(String[] args) throws Exception{
//            MYThread t9 = new MYThread();
//            t9.start(); t9.join():
//
    }
}
//join will execute first run() and then main
