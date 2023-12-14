public class java33varargs {

    static int sum(int...arry){
        int add=0;
        for (int element: arry ) {
            add+=element;
        }
        return add;
    };
    public static void main(String[] args) {
        System.out.println(sum(1,45,54));
    }
}
