import java.util.Scanner;

public class java19 {
    public static void main(String[] args) {
        int in1 ;
        float tax ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income:");
        in1 = sc.nextInt();
        System.out.println("Your Income Is:"+in1);
        if (in1<=250000)
        {
            tax=(in1)*(5)/100;
            System.out.println("The tax percentage is 5%");
            System.out.println("The tax on your Encome is "+tax);
        }
        else if (in1>250000 && in1<500000)
        {
            tax=(in1)*(10)/100;
            System.out.println("The tax percentage is 10%");
            System.out.println("The Tax on your Income is:"+tax);
        }
        else {
            tax=(in1)*(15)/100;
            System.out.println("The tax percentage is 15%");
            System.out.println("The Tax on your Income is:"+tax);
        }
    }
}
