import java.util.Random;
import java.util.Scanner;

class guess{
    public int inputNumber;
    public int randNumber;
    guess () {
        Random numb = new Random();
        randNumber = numb.nextInt(100);
    }
    void takeinput (){
        System.out.println("Guess the number:");
            Scanner sc = new Scanner(System.in);
            inputNumber = sc.nextInt();
        }
        boolean checknumber(){
        if(randNumber==inputNumber){
            return true;
        }
        else if (randNumber<inputNumber) {
            System.out.println("Too Long");
        }
        else if (randNumber>inputNumber) {
            System.out.println("Too short");
        }
        return false;
        }

}

public class java50guessnumber {
    public static void main(String[] args) {
        guess g =new guess();
        boolean b=false;
        while(!b) {
            g.takeinput();
            b = g.checknumber();
            System.out.println(b);
        }
    }
}
