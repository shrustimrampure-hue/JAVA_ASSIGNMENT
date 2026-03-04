package Threads.Ways_Of_Creating_Threads;
class Mytask implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("My Thread: "+i);
        }
    }
}

public class Runnable_for {
    public static void main(String[] args) {
        Mytask objj=new Mytask();
        Thread t4=new Thread(objj);
        t4.start();
        for(int i=1;i<=5;i++){
            System.out.println("Main Thread: "+i);
        }
    }
}
