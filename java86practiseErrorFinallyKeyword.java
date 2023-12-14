import java.util.Scanner;

public class java86practiseErrorFinallyKeyword {
    public static void main(String[] args) {
        int[] num = {45, 39, 75};

        boolean flag = false;
        int a = 1;
        while (true && a < 6) {
            try {
                System.out.println(a + ") Enter the Index :");
                Scanner sc = new Scanner(System.in);
                int ind = sc.nextInt();
                System.out.println("The entered index is : " + num[ind]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid Index");
            }
            a++;

        }
        if(a>=6) {
            System.out.println("5 Chances are over ! Better luck next time");
        }
    }

}
