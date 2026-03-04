package Strings;

public class String_Builder {
    public void StringAppend(){
        StringBuilder sb = new StringBuilder("Hello");
        //sb is local variable pointing to "Hello" in heap outside pool but it will send a copy of "Hello" to poll also
        System.out.println("Old String before append: " + sb);
        sb.append(" World");
        System.out.println("New String appended: " + sb);
    }
        //stringInsert
    public void StringInsert(){
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Old String before insert: " + sb);
        sb.insert(1,"EEEE");
        System.out.println("New String inserted: " + sb);
    }
    public void StringReverse(){
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Old String before reverse: " + sb);
        sb.reverse();
        System.out.println("New String reverse: " + sb);

    }
}
class String_Builder_Example{
    public static void main(String[] args) {
        String_Builder obj=new String_Builder();
        obj.StringAppend();
        obj.StringInsert();
        obj.StringReverse();
    }
}
