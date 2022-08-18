import java.text.DateFormat;
import java.util.*;
public class DateTimeInDifferentCountryFormat
{
    static void Time_formats(Date date_time)
    {
        Locale England_time = new Locale("en", "ch");
        DateFormat de = DateFormat.getDateInstance(DateFormat.FULL, England_time);
        System.out.println("\nThe England Format is: " + de.format(date_time));

        //                            FOR ITALY

        Locale Italy_time = new Locale("it", "ch");
        DateFormat di = DateFormat.getDateInstance(DateFormat.FULL, Italy_time);
        System.out.println("The Italian Format is: " + di.format(date_time));


        Locale Russian_time = new Locale("ru","ch");
        DateFormat dr = DateFormat.getDateInstance(DateFormat.FULL,Russian_time);
        System.out.println("The Russian Format is: "+ dr.format(date_time));
    }

    public static void main(String[] args) {
        System.out.println("The required packages have been imported");
        Date date_time = new Date();
        System.out.println("A date object has been defined");
        Time_formats(date_time);
    }
}