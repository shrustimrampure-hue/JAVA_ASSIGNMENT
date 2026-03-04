class A {
    void show() {
        System.out.print("A");
    }
} class B extends A {
    void show() {
        System.out.print("B");
    }
} public class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
//object can not created to child class