import java.util.Scanner;

public class java82nestedTRY {
    public static void main(String[] args) {
        int num [] = new int[5];
        num[0] = 45;
        num[1] = 55;
        num[2] = 83;
        System.out.println("enter the array index  ;");
        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();
        try{
            System.out.println("you are in first try");
            try {
                System.out.println("Entered array index"+num[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("You have entered the no which is out of array index");
                System.out.println(e);
            }
        }
        catch (Exception e){
            System.out.println("some other exception occured");
            System.out.println(e);
        }
    }
}
