import java.util.GregorianCalendar;
import java.util.TimeZone;

public class _90_Gregorian {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();
        c.getTimeZone();
        System.out.println(c.isLeapYear(2020));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
