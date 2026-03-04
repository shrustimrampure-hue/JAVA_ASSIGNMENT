
import java.util.*;

// Step 1: Create an Enum
enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}


public class Enumsetclass {


    public static void main(String[] args) {

        // 1️ allOf()
        EnumSet<Days> allDays = EnumSet.allOf(Days.class);
        System.out.println("All Days: " + allDays);

        // 2️ noneOf()
        EnumSet<Days> noDays = EnumSet.noneOf(Days.class);
        System.out.println("None Of: " + noDays);

        // 3️ of() - single value
        EnumSet<Days> oneDay = EnumSet.of(Days.MONDAY);
        System.out.println("One Day: " + oneDay);

        // 4️ of() - multiple values
        EnumSet<Days> weekend = EnumSet.of(Days.SATURDAY, Days.SUNDAY);
        System.out.println("Weekend: " + weekend);

        // 5️ range()
        EnumSet<Days> midWeek = EnumSet.range(Days.TUESDAY, Days.FRIDAY);
        System.out.println("Range (Tue-Fri): " + midWeek);

        // 6️ complementOf()
        EnumSet<Days> complement = EnumSet.complementOf(weekend);
        System.out.println("Complement of Weekend: " + complement);

        // 7️ copyOf(EnumSet)
        EnumSet<Days> copySet = EnumSet.copyOf(weekend);
        System.out.println("Copy of Weekend: " + copySet);

        // 8️ copyOf(Collection)
        List<Days> list = Arrays.asList(Days.MONDAY, Days.WEDNESDAY);
        EnumSet<Days> fromCollection = EnumSet.copyOf(list);
        System.out.println("Copy from Collection: " + fromCollection);
    }
}