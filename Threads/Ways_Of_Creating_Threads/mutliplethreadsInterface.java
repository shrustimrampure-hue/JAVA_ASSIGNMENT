package Threads.Ways_Of_Creating_Threads;
class MyTask implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
}

public class mutliplethreadsInterface {
    public static void main(String[] args) {
        MyTask obj=new MyTask();
        //obj.start is not allowed because it is just a task not thread
        Thread t2=new Thread(obj);
        Thread t3=new Thread(obj);
        t2.start();
        t3.start();
    }
}
