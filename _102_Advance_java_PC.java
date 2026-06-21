import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class _102_Advance_java_PC {
    public static void main(String[] args) {
// QUESTION 1
        ArrayList<String> AR = new ArrayList<>();
        AR.add("STUDENT 1");
        AR.add("STUDENT 2");
        AR.add("STUDENT 3");
        AR.add("STUDENT 4");
        AR.add("STUDENT 5");
        AR.add("STUDENT 6");
        AR.add("STUDENT 7");
        AR.add("STUDENT 8");
        AR.add("STUDENT 9");
        AR.add("STUDENT 10");
        for (Object o :AR){
            System.out.print(o+" ");

        }
        System.out.println();
        Date d = new Date();
        // Q 2
        System.out.println(d.getHours() +":"+d.getMinutes()+":"+d.getSeconds());

        // q4
        LocalTime LT = LocalTime.now();
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("H:m:s");
        String mr = LT.format(DF);
        System.out.println(mr);
        // q3

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
// q5
        HashSet<Integer> h = new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(6);
        h.add(5);
        h.add(6);
        System.out.println(h);
    }
}
