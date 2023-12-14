import java.util.Calendar;
import java.util.TimeZone;

public class java98CalenderClass {
    public static void main(String[] args) {
        Calendar c =  Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(TimeZone.getAvailableIDs(0));
        System.out.println(TimeZone.getAvailableIDs(11));
        System.out.println(TimeZone.getAvailableIDs(15));
    }
}
