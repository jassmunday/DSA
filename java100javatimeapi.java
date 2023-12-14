import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class java100javatimeapi {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String myDate = dt.format(tf);
        System.out.println(myDate);
    }
}
