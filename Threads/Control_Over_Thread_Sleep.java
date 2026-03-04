package Threads;
class MyyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child: " + i);
            try {
                Thread.sleep(1000);//control speed of execution';
            } catch (Exception e) {}
        }
    }
}

public class Control_Over_Thread_Sleep {
    public static void main(String[] args) {
        MyyThread t7=new MyyThread();
        t7.start();

        //t7.sleep(1000); cor
    }
}
