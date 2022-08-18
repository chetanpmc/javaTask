import java.io.*;
// Importing Date and time specific Classes
import java.time.*;
import java.time.format.DateTimeFormatter;

class DateInDifferentFormat {

    // Main driver method
    public static void main(String[] args)
    {
        // Create date time object and store current time in
        // default format yy-mm-dd
        LocalDateTime date = LocalDateTime.now();
        LocalDate date1 =LocalDate.now();
        // Specify the date format
        // Note: more than 3 characters result in full name
        DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy");
        // e.g- MMM = Oct and MMMM = October

        DateTimeFormatter myDateFormat1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // in dd//MM/YYYY Format
        // Change date into req format and store it in
        // string object
        String formattedDate = date.format(myDateFormat);
        String formattedDate1 = date.format(myDateFormat1);

        // Printing formatted date
        System.out.println(formattedDate);
        System.out.println(formattedDate1);
        System.out.println("Default Method \n"+date1);
    }
}
