import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Jan26Info {
    public static void main(String[] args) {
        // Create date for January 26
        LocalDate date = LocalDate.of(2026, 1, 26);
        
        // Print basic information
        System.out.println("==== Information About January 26, 2026 ====");
        System.out.println();
        System.out.println("Date: " + date);
        System.out.println("Day of Week: " + date.getDayOfWeek());
        System.out.println("Day of Month: " + date.getDayOfMonth());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Year: " + date.getYear());
        System.out.println();
        
        // Additional information
        System.out.println("Week Number: " + date.getWeekOfYear());
        System.out.println("Day of Year: " + date.getDayOfYear());
        System.out.println();
        
        // Formatted dates
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        System.out.println("Formatted: " + date.format(formatter));
        System.out.println();
        
        System.out.println("Days until end of year: " + (365 - date.getDayOfYear()));
    }
}
