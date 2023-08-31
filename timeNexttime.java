import java.time.LocalDate;
import java.time.temporal.*;

public class timeNexttime {
    public static void main(String[] args) {

        timeNexttime noName = new timeNexttime();

        noName.testChromoUnit();

    }

    public void testChromoUnit() {
        // Get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        // Add 1 week to the current date
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week: " + nextWeek);

        // Add 1 month to the current date
        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + nextMonth);

        // add 1 years to the current date
        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("Next year: " + nextYear);

        LocalDate nextDecde = today.plus(1, ChronoUnit.DECADES);
        System.out.println("Next year: " + nextDecde);
    }
}