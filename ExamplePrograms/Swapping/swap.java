package ExamplePrograms.Swapping;

public class swap {
    public static void swapping(int arr[ ]){
        int temp = arr[0]; arr[0] = arr[1]; arr[1] = temp;
    }

    public static void main(String[] args) {

        int arr[]={10,20};
        System.out.println("Before swapping a is: "+arr[0] +"and b is: "+arr[1]);
        swapping(arr);
        System.out.println("After swapping a is: "+arr[0] +"and b is: "+arr[1]);

    }
}
