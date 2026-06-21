import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _101_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dT = LocalDateTime.now();
        System.out.println(dT);
        DateTimeFormatter DF= DateTimeFormatter.ofPattern("dd-MM-yyyy -->E-->H:m a");
      DateTimeFormatter DF2= DateTimeFormatter.ISO_LOCAL_DATE;
      //  DateTimeFormatter DF2= DateTimeFormatter.ISO_DATE_TIME;
     //  DateTimeFormatter DF2= DateTimeFormatter.ISO_ORDINAL_DATE;
      //  String myDate = dT.format(DF2);
        String myDate = dT.format(DF);
        //System.out.println(myDate);
        System.out.println(myDate);
    }
}
