package Threads;
class mytask implements Runnable{
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child: " + i);
        }
    }
}

public class Runnable_Join {
    public static void main(String[] args)throws Exception {
        mytask object=new mytask();
        Thread t0=new Thread(object);
        t0.start();
        t0.join();
        System.out.println("Main Thread Finished!");

    }
}
