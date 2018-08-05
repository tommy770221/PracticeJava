import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateDemo {

    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        date.setTime(1431141312212L);
        System.out.println(date);

        DateFormat df1=null;
        DateFormat df2=null;
        DateFormat df3=null;
        DateFormat df4=null;


        df1=DateFormat.getDateInstance();
        df2=DateFormat.getDateTimeInstance();
        System.out.println(df1.format(date));
        System.out.println(df2.format(date));

        df3=DateFormat.getDateInstance(DateFormat.FULL,new Locale("zh","TW"));
        df4=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,new Locale("zh","TW"));
        System.out.println(df3.format(date));
        System.out.println(df4.format(date));

        String strDate="2010-10-19 10:11:30.345";
        Date d = null;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        d=sdf.parse(strDate);
        System.out.println(d);


    }


}
