import java.util.Scanner;

class lessAgeException extends Exception{
    public String toString(){
       return "AGE LESSER EXCEPTION";
    }
    public  String getMessage(){
        return "Minimum age to vote is 18" ;
    }
}
class overAgeException extends Exception{
    public String toString(){
        return "OVER AGE EXCEPTION";
    }
    public  String getMessage(){
        return "Maximum  age to vote is 60" ;
    }
}

public class java83ThrowException {
    static void vote(int age) throws lessAgeException, overAgeException {
        if (age < 18) {
            throw new lessAgeException();
        } else if (age > 60) {
            throw new overAgeException();
        } else {
            System.out.println("keep voting");
        }
    }

    public static void main(String[] args) {
        int age;
        System.out.println("Enter the a : ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
         try{
             vote(age);
         }
         catch (overAgeException e) {
             throw new RuntimeException(e);
         }
         catch (lessAgeException e) {
             throw new RuntimeException(e);
         }
    }
}
