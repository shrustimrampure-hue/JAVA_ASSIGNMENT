package Threads.Ways_Of_Creating_Threads;
class MyThread extends Thread{
    public void run(){//coming from runnable interfaces mandatory
        System.out.println("Thread Running");
    }
}

public class multi_thread {
    public static void main(String[] args) {
        MyThread m1= new MyThread();
        m1.start();//multithreading
        System.out.println("Main Thread Running");
    }
}
