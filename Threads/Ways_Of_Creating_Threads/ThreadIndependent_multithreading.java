package Threads.Ways_Of_Creating_Threads;
class MThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("My Thread: "+i);
        }
    }
}

public class ThreadIndependent_multithreading {
    public static void main(String[] args) {
        MThread t1=new MThread();
        t1.start();
        for(int i=1;i<=5;i++){
            System.out.println("Main Thread: "+i);
        }
    }
}
/*
start() creates new thread
run() contains logic
Output order is unpredictable
Both threads run independently
 */
