public class java32overloading {
    // changing array element
    static void change(int[] arry){
        arry[1]=86;
    };
    public static void main(String[] args) {
        int[] marks ={57,45,78,93};
        change(marks);
        System.out.println(marks[0]);
    }
}
