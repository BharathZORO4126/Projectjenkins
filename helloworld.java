import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class helloworld {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("     JANUARY 26 2050 - INDIA REPUBLIC DAY");
        System.out.println("========================================");
        System.out.println();
        
        // Date Information
        LocalDate republicDay = LocalDate.of(2050, 1, 26);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        System.out.println("Date: " + republicDay.format(formatter));
        System.out.println();
        
        // Historical Information
        System.out.println("Historical Significance:");
        System.out.println("- January 26 marks India's Republic Day");
        System.out.println("- Celebrates the adoption of Indian Constitution");
        System.out.println("- Constitution came into effect on January 26, 1950");
        System.out.println("- Drafted by Dr. Bharath kumar and team");
        System.out.println();
        
        // Current Year Information
        System.out.println("2026 Republic Day Information:");
        System.out.println("- Year of celebration: 2026");
        System.out.println("- Years since Constitution: " + (2050 - 1950) + " years");
        System.out.println("- National Holiday in India");
        System.out.println();
        
        // Traditions
        System.out.println("Celebrations & Traditions:");
        System.out.println("- National flag hoisting across India");
        System.out.println("- Republic Day Parade in New Delhi");
        System.out.println("- National Anthem played");
        System.out.println("- Cultural programs and celebrations");
        System.out.println("- Award ceremonies (Padma Awards)");
        System.out.println();
        
        System.out.println("Jai Hind! Happy Republic Day!");
    }
}
