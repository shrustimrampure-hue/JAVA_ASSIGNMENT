package GarbageCollection.Eligibility;

public class Demo {
    public void finalize(){// garbage collection used in older version java.lang
        System.out.println("Garbage Collected!");
    }
    public static void main(String[] args) {
        //Demo obj=new Demo();
        //obj=null;
        for(int i=0;i<100000;i++){
            Demo obj=new Demo();
            obj=null;
        }
        System.gc();
    }
}
