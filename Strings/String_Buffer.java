package Strings;

public class String_Buffer {
        public void StringAppend(){
            StringBuffer sb = new StringBuffer("Hello");
            //sb is local variable pointing to "Hello" in heap outside pool but it will send a copy of "Hello" to poll also
            System.out.println("Old String before append: " + sb);
            sb.append(" World");
            System.out.println("New String appended: " + sb);
        }
        //stringInsert
        public void StringInsert(){
            StringBuffer sb = new StringBuffer("Hello");
            System.out.println("Old String before insert: " + sb);
            sb.insert(1,"EEEE");
            System.out.println("New String inserted: " + sb);
        }
        public void StringReverse(){
            StringBuffer sb = new StringBuffer("Hello");
            System.out.println("Old String before reverse: " + sb);
            sb.reverse();
            System.out.println("New String reverse: " + sb);

        }
    }
    class String_Buffer_Example{
        public static void main(String[] args) {
            String_Buffer obj=new String_Buffer();
            obj.StringAppend();
            obj.StringInsert();
            obj.StringReverse();
        }
    }


