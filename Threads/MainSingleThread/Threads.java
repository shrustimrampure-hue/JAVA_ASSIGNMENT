package Threads.MainSingleThread;

public class Threads {
    public static void main(String[] args) {// Main itself a thread
        System.out.println("Main Thread Started!");
        for(int i=0;i<5;i++){
            System.out.println("Main Thread: "+i);
        }
        System.out.println("Main thread supported");
    }
}
