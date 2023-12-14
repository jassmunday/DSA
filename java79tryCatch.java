public class java79tryCatch {
    public static void main(String[] args) {
        int a= 100;
        int b=0;
        try {
            int c = a / b;
        }
        catch (Exception e){
            System.out.println("You are trying something wrong ");
            System.out.println(e);
        }

    }
}
