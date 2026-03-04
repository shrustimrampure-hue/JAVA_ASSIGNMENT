package ExamplePrograms;

public class Hello{
    void stat() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
class stata{
    public static void main(String[] args) {
        Hello h =new Hello();
        h.stat();
        h.stat();
    }
}