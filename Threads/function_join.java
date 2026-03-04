package Threads;
class MYTHREAD extends Thread{
    Thread other;
    MYTHREAD(Thread other){
        this.other=other;
    }
    public void run(){
        try{
            if(other!=null){
                other.join();
            }
        }catch (Exception e){}
        System.out.println(Thread.currentThread().getName()+"Finished");
    }
}

public class function_join {
    public static void main(String[] args) {
        MYTHREAD th=new MYTHREAD(null);
        MYTHREAD thh=new MYTHREAD(th);
        th.start();
        thh.start();

    }
}
