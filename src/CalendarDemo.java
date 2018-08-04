import java.util.Calendar;

public class CalendarDemo {

    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();

        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        calendar.set(Calendar.YEAR,2012);
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeInMillis());

    }
}
