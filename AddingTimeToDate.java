import java.util.*;

public class AddingTimeToDate{
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        Calendar cl = Calendar. getInstance();
        cl.setTime(d1);
        System.out.println("today is " + d1.toString());
    }
}