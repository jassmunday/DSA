import java.util.Scanner;

public class java6marks {
    public static void main(String[] args) {
        System.out.println("enter marks for math:");
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();

        System.out.println("enter marks for Physics:");
        int p= scn.nextInt();

        System.out.println("enter marks for chemistry:");
        int c= scn.nextInt();

        System.out.println("enter marks for english:");
        int e= scn.nextInt();

        System.out.println("enter marks for hindi:");
        int h = scn.nextInt();
        float sum= m+p+c+e+h;
        float percent = (sum/500)*100;

        System.out.println("percentage is :"+percent);


    }
}
